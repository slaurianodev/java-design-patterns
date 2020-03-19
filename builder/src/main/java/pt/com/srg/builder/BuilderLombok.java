package pt.com.srg.builder;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class BuilderLombok {
    public static void main(String[] args) {
        Transacao2 transacao2 = Transacao2.builder()
                .dataTransacao(LocalDateTime.now())
                .estabelecimento("Vendinha da Tia")
                .localCompra("Saldanha")
                .build();
        System.out.println(transacao2 != null);
    }
}

@Builder
@Getter
@ToString
class Transacao2 {

    private String metodoPagamento;
    private String numeroCartao;
    private String localCompra;
    private String estabelecimento;
    private LocalDateTime dataTransacao;
    private BigDecimal valor;


}