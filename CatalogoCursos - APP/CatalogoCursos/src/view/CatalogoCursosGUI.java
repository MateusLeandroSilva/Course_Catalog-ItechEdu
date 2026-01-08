package view;

import model.PacoteCurso;

import javax.swing.*;
import java.util.ArrayList;

public class CatalogoCursosGUI extends JFrame {

    private JComboBox<String> comboCursos;
    private JTextArea areaDetalhes;
    private ArrayList<PacoteCurso> pacotes;

    public CatalogoCursosGUI() {

        setTitle("Catálogo de Cursos");
        setSize(480, 480);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        inicializarPacotes();
        criarComponentes();
    }

    private void inicializarPacotes() {
        pacotes = new ArrayList<>();

        pacotes.add(new PacoteCurso(
                "Administração de Pessoas",
                "Gestão Administrativa\nGestão de RH\nDepartamento Pessoal\nLiderança",
                59, 8, "R$ 2.065,00"
        ));

        pacotes.add(new PacoteCurso(
                "Administração de Pessoas",
                "Gestão Administrativa\nGestão de RH\nDepartamento Pessoal\n"
                        + "Crédito, Cobrança e Atendimento\nEmpreendedorismo\nLiderança Eficaz",
                59, 8, "R$ 2.065,00"
        ));

        pacotes.add(new PacoteCurso(
                "Agente de Portaria",
                "Controle de acesso\nAtendimento\nSegurança Patrimonial",
                5, 1, "R$ 175,00"
        ));

        pacotes.add(new PacoteCurso(
                "Assistente Financeiro",
                "Excel Avançado\nPower BI\nEducação Financeira\nOperador de Caixa",
                90, 11, "R$ 3.150,00"
        ));
    }

    private void criarComponentes() {

        JLabel titulo = new JLabel("Selecione um pacote de curso:");
        titulo.setBounds(20, 20, 300, 20);
        add(titulo);

        comboCursos = new JComboBox<>();
        for (PacoteCurso p : pacotes) {
            comboCursos.addItem(p.getNome());
        }
        comboCursos.setBounds(20, 50, 420, 25);
        add(comboCursos);

        areaDetalhes = new JTextArea();
        areaDetalhes.setEditable(false);
        areaDetalhes.setLineWrap(true);
        areaDetalhes.setWrapStyleWord(true);

        JScrollPane scroll = new JScrollPane(areaDetalhes);
        scroll.setBounds(20, 90, 420, 260);
        add(scroll);

        JButton btnDetalhes = new JButton("Ver Detalhes");
        btnDetalhes.setBounds(20, 370, 160, 35);
        add(btnDetalhes);

        JButton btnSair = new JButton("Sair");
        btnSair.setBounds(280, 370, 160, 35);
        add(btnSair);

        btnDetalhes.addActionListener(e -> {
            int index = comboCursos.getSelectedIndex();
            areaDetalhes.setText(pacotes.get(index).getDetalhes());
        });

        btnSair.addActionListener(e -> System.exit(0));
    }
}

