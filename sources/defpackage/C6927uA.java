package defpackage;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.MalformedInputException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: uA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6927uA {
    public static final CharBuffer a = CharBuffer.allocate(0);

    @NotNull
    public static final ByteBuffer b;

    static {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(0);
        Intrinsics.checkNotNull(byteBufferAllocate);
        b = byteBufferAllocate;
    }

    public static final boolean a(@NotNull CharsetEncoder charsetEncoder, @NotNull C2895bC dst) {
        Intrinsics.checkNotNullParameter(charsetEncoder, "<this>");
        Intrinsics.checkNotNullParameter(dst, "dst");
        int i = dst.c;
        int i2 = dst.e - i;
        ByteBuffer byteBuffer = WY0.a;
        ByteBuffer buffer = C6621sj.p(dst.a, i, i2);
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        CoderResult result = charsetEncoder.encode(a, buffer, true);
        if (result.isMalformed() || result.isUnmappable()) {
            Intrinsics.checkNotNullExpressionValue(result, "result");
            e(result);
        }
        boolean zIsUnderflow = result.isUnderflow();
        if (buffer.limit() != i2) {
            throw new IllegalStateException("Buffer's limit change is not allowed");
        }
        dst.a(buffer.position());
        return zIsUnderflow;
    }

    public static final int b(@NotNull CharsetEncoder charsetEncoder, @NotNull CharSequence input, int i, int i2, @NotNull C2895bC dst) {
        Intrinsics.checkNotNullParameter(charsetEncoder, "<this>");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(dst, "dst");
        CharBuffer charBufferWrap = CharBuffer.wrap(input, i, i2);
        int iRemaining = charBufferWrap.remaining();
        int i3 = dst.c;
        int i4 = dst.e - i3;
        ByteBuffer byteBuffer = WY0.a;
        ByteBuffer buffer = C6621sj.p(dst.a, i3, i4);
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        CoderResult result = charsetEncoder.encode(charBufferWrap, buffer, false);
        if (result.isMalformed() || result.isUnmappable()) {
            Intrinsics.checkNotNullExpressionValue(result, "result");
            e(result);
        }
        if (buffer.limit() != i4) {
            throw new IllegalStateException("Buffer's limit change is not allowed");
        }
        dst.a(buffer.position());
        return iRemaining - charBufferWrap.remaining();
    }

    @NotNull
    public static final byte[] c(@NotNull CharsetEncoder charsetEncoder, @NotNull String input, int i) throws CharacterCodingException {
        Intrinsics.checkNotNullParameter(charsetEncoder, "<this>");
        Intrinsics.checkNotNullParameter(input, "input");
        if (input != null) {
            if (i == input.length()) {
                byte[] bytes = input.getBytes(charsetEncoder.charset());
                Intrinsics.checkNotNullExpressionValue(bytes, "input as java.lang.String).getBytes(charset())");
                return bytes;
            }
            String strSubstring = input.substring(0, i);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            Intrinsics.c(strSubstring, "null cannot be cast to non-null type java.lang.String");
            byte[] bytes2 = strSubstring.getBytes(charsetEncoder.charset());
            Intrinsics.checkNotNullExpressionValue(bytes2, "input.substring(fromInde…ring).getBytes(charset())");
            return bytes2;
        }
        ByteBuffer byteBufferEncode = charsetEncoder.encode(CharBuffer.wrap(input, 0, i));
        byte[] bArr = null;
        if (byteBufferEncode.hasArray() && byteBufferEncode.arrayOffset() == 0) {
            byte[] bArrArray = byteBufferEncode.array();
            if (bArrArray.length == byteBufferEncode.remaining()) {
                bArr = bArrArray;
            }
        }
        if (bArr != null) {
            return bArr;
        }
        byte[] bArr2 = new byte[byteBufferEncode.remaining()];
        byteBufferEncode.get(bArr2);
        return bArr2;
    }

    @NotNull
    public static final String d(@NotNull Charset charset) {
        Intrinsics.checkNotNullParameter(charset, "<this>");
        String strName = charset.name();
        Intrinsics.checkNotNullExpressionValue(strName, "name()");
        return strName;
    }

    public static final void e(CoderResult coderResult) {
        try {
            coderResult.throwException();
        } catch (MalformedInputException e) {
            String message = e.getMessage();
            if (message == null) {
                message = "Failed to decode bytes";
            }
            throw new C3375dW0(message);
        }
    }
}
