package defpackage;

import java.net.ProtocolException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class ZP1 {

    @NotNull
    public final EnumC1298Jk1 a;
    public final int b;

    @NotNull
    public final String c;

    public static final class a {
        @NotNull
        public static ZP1 a(@NotNull String statusLine) throws ProtocolException {
            int i;
            String strSubstring;
            Intrinsics.checkNotNullParameter(statusLine, "statusLine");
            boolean zO = d.o(statusLine, "HTTP/1.", false);
            EnumC1298Jk1 enumC1298Jk1 = EnumC1298Jk1.HTTP_1_0;
            if (zO) {
                i = 9;
                if (statusLine.length() < 9 || statusLine.charAt(8) != ' ') {
                    throw new ProtocolException("Unexpected status line: ".concat(statusLine));
                }
                int iCharAt = statusLine.charAt(7) - '0';
                if (iCharAt != 0) {
                    if (iCharAt != 1) {
                        throw new ProtocolException("Unexpected status line: ".concat(statusLine));
                    }
                    enumC1298Jk1 = EnumC1298Jk1.HTTP_1_1;
                }
            } else {
                if (!d.o(statusLine, "ICY ", false)) {
                    throw new ProtocolException("Unexpected status line: ".concat(statusLine));
                }
                i = 4;
            }
            int i2 = i + 3;
            if (statusLine.length() < i2) {
                throw new ProtocolException("Unexpected status line: ".concat(statusLine));
            }
            try {
                String strSubstring2 = statusLine.substring(i, i2);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                int i3 = Integer.parseInt(strSubstring2);
                if (statusLine.length() <= i2) {
                    strSubstring = "";
                } else {
                    if (statusLine.charAt(i2) != ' ') {
                        throw new ProtocolException("Unexpected status line: ".concat(statusLine));
                    }
                    strSubstring = statusLine.substring(i + 4);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
                }
                return new ZP1(enumC1298Jk1, i3, strSubstring);
            } catch (NumberFormatException unused) {
                throw new ProtocolException("Unexpected status line: ".concat(statusLine));
            }
        }
    }

    public ZP1(@NotNull EnumC1298Jk1 protocol, int i, @NotNull String message) {
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        Intrinsics.checkNotNullParameter(message, "message");
        this.a = protocol;
        this.b = i;
        this.c = message;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.a == EnumC1298Jk1.HTTP_1_0) {
            sb.append("HTTP/1.0");
        } else {
            sb.append("HTTP/1.1");
        }
        sb.append(' ');
        sb.append(this.b);
        sb.append(' ');
        sb.append(this.c);
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
