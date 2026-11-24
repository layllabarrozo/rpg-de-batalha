package dao;
import to.Player;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Placar{
	public static final String ARQUIVO = "placar.txt";
    public static final String ARQUIVO_HISTORICO = "historico.txt";

    public void registrarVitoria(Player vencedor){
        try(FileWriter writer = new FileWriter(ARQUIVO, true)){
            writer.write(vencedor.getNome() + " venceu com " + vencedor.getVida() + " de vida restante\n");
        }
        catch(IOException e){
            System.err.println("Erro ao gravar o placar: "+ e.getMessage());
        }
    }

    public ArrayList<String> carregarPlacar() {
        ArrayList<String> linhas = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(ARQUIVO))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                linhas.add(linha);
            }
        } catch (IOException e) {
            System.err.println("Não foi possível ler o placar: " + e.getMessage());
        }
        return linhas;
    }

    public void registrar(String frase) {
        try(FileWriter writer = new FileWriter(ARQUIVO_HISTORICO, true)){
            writer.write(frase + "\n");
        }
        catch(IOException e){
            System.err.println("Erro ao gravar histórico: " + e.getMessage());
        }
    }

    public ArrayList<String> carregarHistorico() {
        ArrayList<String> linhas = new ArrayList<>();

        try(BufferedReader reader = new BufferedReader(new FileReader(ARQUIVO_HISTORICO))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                linhas.add(linha);
            }
        }catch(IOException e) {
            System.err.println("Não foi possível ler o histórico: " + e.getMessage());
        }

        return linhas;
    }
}