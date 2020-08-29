/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda.modelo;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author DGTALE
 */
public class Recado {
    private String emitente;
    private String municipio;
    private String destinatario;
    private Date data;
    private String conteudo;

    public Recado() {
    }

    public Recado(String emitente, String municipio, String destinatario, Date data, String conteudo) {
        this.emitente = emitente;
        this.municipio = municipio;
        this.destinatario = destinatario;
        this.data = data;
        this.conteudo = conteudo;
    }

    public String getEmitente() {
        return emitente;
    }

    public void setEmitente(String emitente) {
        this.emitente = emitente;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.emitente);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Recado other = (Recado) obj;
        if (!Objects.equals(this.emitente, other.emitente)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Recado{" + "emitente=" + emitente + '}';
    }
    
    
    
}
