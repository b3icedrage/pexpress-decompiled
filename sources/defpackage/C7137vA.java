package defpackage;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: vA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7137vA {

    @NotNull
    public final AA0 a;

    @NotNull
    public final CharsetDecoder b;

    @NotNull
    public final ByteBuffer c;
    public boolean d;
    public char e;

    public C7137vA(@NotNull AA0 inputStream, @NotNull Charset charset) {
        byte[] bArr;
        Intrinsics.checkNotNullParameter(inputStream, "inputStream");
        Intrinsics.checkNotNullParameter(charset, "charset");
        this.a = inputStream;
        CharsetDecoder charsetDecoderNewDecoder = charset.newDecoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        CharsetDecoder charsetDecoderOnUnmappableCharacter = charsetDecoderNewDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        Intrinsics.checkNotNullExpressionValue(charsetDecoderOnUnmappableCharacter, "onUnmappableCharacter(...)");
        this.b = charsetDecoderOnUnmappableCharacter;
        C2189Uv c2189Uv = C2189Uv.b;
        synchronized (c2189Uv) {
            C6202qj<byte[]> c6202qj = c2189Uv.a;
            byte[] bArrRemoveLast = c6202qj.isEmpty() ? null : c6202qj.removeLast();
            bArr = bArrRemoveLast != null ? bArrRemoveLast : null;
        }
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr == null ? new byte[8196] : bArr);
        Intrinsics.checkNotNullExpressionValue(byteBufferWrap, "wrap(...)");
        this.c = byteBufferWrap;
        byteBufferWrap.flip();
    }

    public final int a(@NotNull char[] array, int i, int i2) throws CharacterCodingException {
        int i3;
        CharsetDecoder charsetDecoder;
        char c;
        Intrinsics.checkNotNullParameter(array, "array");
        if (i2 == 0) {
            return 0;
        }
        if (i < 0 || i >= array.length || i2 < 0 || i + i2 > array.length) {
            throw new IllegalArgumentException(("Unexpected arguments: " + i + ", " + i2 + ", " + array.length).toString());
        }
        boolean z = true;
        if (this.d) {
            array[i] = this.e;
            i++;
            i2--;
            this.d = false;
            if (i2 == 0) {
                return 1;
            }
            i3 = 1;
        } else {
            i3 = 0;
        }
        if (i2 == 1) {
            if (this.d) {
                this.d = false;
                c = this.e;
            } else {
                char[] cArr = new char[2];
                int iA = a(cArr, 0, 2);
                if (iA == -1) {
                    c = 65535;
                } else if (iA == 1) {
                    c = cArr[0];
                } else {
                    if (iA != 2) {
                        throw new IllegalStateException(("Unreachable state: " + iA).toString());
                    }
                    this.e = cArr[1];
                    this.d = true;
                    c = cArr[0];
                }
            }
            if (c != 65535) {
                array[i] = c;
                return i3 + 1;
            }
            if (i3 == 0) {
                return -1;
            }
            return i3;
        }
        CharBuffer charBufferWrap = CharBuffer.wrap(array, i, i2);
        if (charBufferWrap.position() != 0) {
            charBufferWrap = charBufferWrap.slice();
        }
        CharBuffer charBuffer = charBufferWrap;
        boolean z2 = false;
        while (true) {
            charsetDecoder = this.b;
            ByteBuffer byteBuffer = this.c;
            CoderResult coderResultDecode = charsetDecoder.decode(byteBuffer, charBuffer, z2);
            if (coderResultDecode.isUnderflow()) {
                if (z2 || !charBuffer.hasRemaining()) {
                    z = z2;
                    break;
                }
                byteBuffer.compact();
                try {
                    int iLimit = byteBuffer.limit();
                    int iPosition = byteBuffer.position();
                    int iRemaining = this.a.read(byteBuffer.array(), byteBuffer.arrayOffset() + iPosition, iPosition <= iLimit ? iLimit - iPosition : 0);
                    if (iRemaining < 0) {
                        byteBuffer.flip();
                    } else {
                        byteBuffer.position(iPosition + iRemaining);
                        byteBuffer.flip();
                        iRemaining = byteBuffer.remaining();
                    }
                    if (iRemaining < 0) {
                        if (charBuffer.position() == 0 && !byteBuffer.hasRemaining()) {
                            break;
                        }
                        charsetDecoder.reset();
                        z2 = true;
                    } else {
                        continue;
                    }
                } catch (Throwable th) {
                    byteBuffer.flip();
                    throw th;
                }
            } else {
                if (coderResultDecode.isOverflow()) {
                    charBuffer.position();
                    z = z2;
                    break;
                }
                coderResultDecode.throwException();
            }
        }
        if (z) {
            charsetDecoder.reset();
        }
        return (charBuffer.position() != 0 ? charBuffer.position() : -1) + i3;
    }
}
