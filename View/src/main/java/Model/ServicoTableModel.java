/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author pedro
 */
public class ServicoTableModel  extends AbstractTableModel{
    
    
    private List<Servico> dados = new ArrayList<>();
    private String [] colunas = {"Nome","Telefone","Agendamento","Serviço"};
    
    @Override
    public int getRowCount() {
         return dados.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        switch(coluna){
            case 0:
                return dados.get(linha).getNome();
            case 1: 
                return dados.get(linha).getTelefone();
            case 2: 
                return dados.get(linha).getAgendamento();
            case 3:
                return dados.get(linha).getServico();
        }
        return null;
    }
    
}
