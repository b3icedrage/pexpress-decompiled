package defpackage;

import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.d;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: tG0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6736tG0 {

    @NotNull
    public final byte[] a;

    @NotNull
    public final byte[] b;

    @NotNull
    public final byte[] c;

    public C6736tG0(@NotNull Charset charset) throws CharacterCodingException {
        byte[] bArrC;
        byte[] bArrC2;
        byte[] bArrC3;
        Intrinsics.checkNotNullParameter(charset, "charset");
        Charset charset2 = Charsets.UTF_8;
        if (Intrinsics.a(charset, charset2)) {
            bArrC = d.g("[");
        } else {
            CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
            Intrinsics.checkNotNullExpressionValue(charsetEncoderNewEncoder, "charset.newEncoder()");
            bArrC = C6927uA.c(charsetEncoderNewEncoder, "[", 1);
        }
        this.a = bArrC;
        if (Intrinsics.a(charset, charset2)) {
            bArrC2 = d.g("]");
        } else {
            CharsetEncoder charsetEncoderNewEncoder2 = charset.newEncoder();
            Intrinsics.checkNotNullExpressionValue(charsetEncoderNewEncoder2, "charset.newEncoder()");
            bArrC2 = C6927uA.c(charsetEncoderNewEncoder2, "]", 1);
        }
        this.b = bArrC2;
        if (Intrinsics.a(charset, charset2)) {
            bArrC3 = d.g(",");
        } else {
            CharsetEncoder charsetEncoderNewEncoder3 = charset.newEncoder();
            Intrinsics.checkNotNullExpressionValue(charsetEncoderNewEncoder3, "charset.newEncoder()");
            bArrC3 = C6927uA.c(charsetEncoderNewEncoder3, ",", 1);
        }
        this.c = bArrC3;
    }
}
