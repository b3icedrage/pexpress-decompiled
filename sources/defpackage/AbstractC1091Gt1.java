package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Gt1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1091Gt1 implements Closeable {

    @Nullable
    public a d;

    /* JADX INFO: renamed from: Gt1$a */
    public static final class a extends Reader {

        @NotNull
        public final InterfaceC2833av d;

        @NotNull
        public final Charset e;
        public boolean g;

        @Nullable
        public InputStreamReader h;

        public a(@NotNull InterfaceC2833av source, @NotNull Charset charset) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(charset, "charset");
            this.d = source;
            this.e = charset;
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            Unit unit;
            this.g = true;
            InputStreamReader inputStreamReader = this.h;
            if (inputStreamReader != null) {
                inputStreamReader.close();
                unit = Unit.a;
            } else {
                unit = null;
            }
            if (unit == null) {
                this.d.close();
            }
        }

        @Override // java.io.Reader
        public final int read(@NotNull char[] cbuf, int i, int i2) throws IOException {
            Intrinsics.checkNotNullParameter(cbuf, "cbuf");
            if (this.g) {
                throw new IOException("Stream closed");
            }
            InputStreamReader inputStreamReader = this.h;
            if (inputStreamReader == null) {
                InterfaceC2833av interfaceC2833av = this.d;
                inputStreamReader = new InputStreamReader(interfaceC2833av.r1(), C6806tc2.t(interfaceC2833av, this.e));
                this.h = inputStreamReader;
            }
            return inputStreamReader.read(cbuf, i, i2);
        }
    }

    @NotNull
    public final byte[] c() throws IOException {
        C1169Ht1 c1169Ht1 = (C1169Ht1) this;
        long j = c1169Ht1.g;
        if (j > 2147483647L) {
            throw new IOException(C6419rl.a("Cannot buffer entire body for content length: ", j));
        }
        C1481Lu c1481Lu = c1169Ht1.h;
        try {
            byte[] bArrW = c1481Lu.W(c1481Lu.e);
            int length = bArrW.length;
            if (j == -1 || j == length) {
                return bArrW;
            }
            throw new IOException("Content-Length (" + j + ") and stream length (" + length + ") disagree");
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                C6621sj.b(c1481Lu, th);
                throw th2;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        C6806tc2.d(k());
    }

    public abstract long f();

    @Nullable
    public abstract CY0 g();

    @NotNull
    public abstract InterfaceC2833av k();

    @NotNull
    public final String l() throws IOException {
        Charset charsetA;
        InterfaceC2833av interfaceC2833avK = k();
        try {
            CY0 cy0G = g();
            if (cy0G == null || (charsetA = cy0G.a(Charsets.UTF_8)) == null) {
                charsetA = Charsets.UTF_8;
            }
            String strC0 = interfaceC2833avK.C0(C6806tc2.t(interfaceC2833avK, charsetA));
            interfaceC2833avK.close();
            return strC0;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                C6621sj.b(interfaceC2833avK, th);
                throw th2;
            }
        }
    }
}
