package defpackage;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Jk1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC1298Jk1 {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");


    @NotNull
    public final String d;

    /* JADX INFO: renamed from: Jk1$a */
    public static final class a {
        @NotNull
        public static EnumC1298Jk1 a(@NotNull String protocol) throws IOException {
            Intrinsics.checkNotNullParameter(protocol, "protocol");
            if (protocol.equals("http/1.0")) {
                return EnumC1298Jk1.HTTP_1_0;
            }
            if (protocol.equals("http/1.1")) {
                return EnumC1298Jk1.HTTP_1_1;
            }
            if (protocol.equals("h2_prior_knowledge")) {
                return EnumC1298Jk1.H2_PRIOR_KNOWLEDGE;
            }
            if (protocol.equals("h2")) {
                return EnumC1298Jk1.HTTP_2;
            }
            if (protocol.equals("spdy/3.1")) {
                return EnumC1298Jk1.SPDY_3;
            }
            if (protocol.equals("quic")) {
                return EnumC1298Jk1.QUIC;
            }
            throw new IOException("Unexpected protocol: ".concat(protocol));
        }
    }

    EnumC1298Jk1(String str) {
        this.d = str;
    }

    @Override // java.lang.Enum
    @NotNull
    public final String toString() {
        return this.d;
    }
}
