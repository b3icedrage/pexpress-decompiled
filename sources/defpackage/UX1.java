package defpackage;

import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.d;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class UX1 extends AbstractC1112Ha1.a {

    @NotNull
    public final String a;

    @NotNull
    public final C4651jM b;

    @NotNull
    public final byte[] c;

    public UX1(String text, C4651jM contentType) throws CharacterCodingException {
        byte[] bArrC;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        this.a = text;
        this.b = contentType;
        Charset charsetD = C5207m.d(contentType);
        charsetD = charsetD == null ? Charsets.UTF_8 : charsetD;
        if (Intrinsics.a(charsetD, Charsets.UTF_8)) {
            bArrC = d.g(text);
        } else {
            CharsetEncoder charsetEncoderNewEncoder = charsetD.newEncoder();
            Intrinsics.checkNotNullExpressionValue(charsetEncoderNewEncoder, "charset.newEncoder()");
            bArrC = C6927uA.c(charsetEncoderNewEncoder, text, text.length());
        }
        this.c = bArrC;
    }

    @Override // defpackage.AbstractC1112Ha1
    @NotNull
    public final Long a() {
        return Long.valueOf(this.c.length);
    }

    @Override // defpackage.AbstractC1112Ha1
    @NotNull
    public final C4651jM b() {
        return this.b;
    }

    @Override // defpackage.AbstractC1112Ha1.a
    @NotNull
    public final byte[] d() {
        return this.c;
    }

    @NotNull
    public final String toString() {
        return "TextContent[" + this.b + "] \"" + KS1.B(30, this.a) + '\"';
    }
}
