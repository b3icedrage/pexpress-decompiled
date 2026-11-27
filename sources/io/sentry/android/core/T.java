package io.sentry.android.core;

import defpackage.C3537eG1;
import defpackage.C5900pH0;
import defpackage.EG1;
import defpackage.NG1;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Date;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class T {

    @NotNull
    public final SentryAndroidOptions a;

    @NotNull
    public final ArrayList b = new ArrayList();
    public boolean c = false;

    public static final class b {

        @Nullable
        public final String a;
        public final int b;

        public b(@Nullable String str, int i) {
            this.a = str;
            this.b = i;
        }
    }

    public static final class c {

        @NotNull
        public final File a;
        public final long b;

        public c(@NotNull File file, long j) {
            this.a = file;
            this.b = j;
        }
    }

    public static final class d {

        @NotNull
        public final EG1 a;

        @NotNull
        public final File b;

        @NotNull
        public final C3537eG1 c;

        public d(@NotNull EG1 eg1, @NotNull File file, @NotNull C3537eG1 c3537eG1) {
            this.a = eg1;
            this.b = file;
            this.c = c3537eG1;
        }
    }

    public T(@NotNull SentryAndroidOptions sentryAndroidOptions) {
        this.a = sentryAndroidOptions;
    }

    public static void c(@NotNull BufferedInputStream bufferedInputStream, long j) throws IOException {
        while (j > 0) {
            long jSkip = bufferedInputStream.skip(j);
            if (jSkip != 0) {
                j -= jSkip;
            } else {
                if (bufferedInputStream.read() == -1) {
                    throw new EOFException("Unexpected end of stream while skipping bytes");
                }
                j--;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004d  */
    @Nullable
    public final c a(@NotNull BufferedInputStream bufferedInputStream, int i, @NotNull File file) {
        byte b2;
        SentryAndroidOptions sentryAndroidOptions = this.a;
        c cVar = null;
        try {
            a aVar = new a(bufferedInputStream, i);
            try {
                InputStreamReader inputStreamReader = new InputStreamReader(aVar, StandardCharsets.UTF_8);
                try {
                    C5900pH0 c5900pH0 = new C5900pH0(inputStreamReader);
                    io.sentry.vendor.gson.stream.a aVar2 = c5900pH0.d;
                    c5900pH0.X0();
                    String strE0 = null;
                    Date dateD0 = null;
                    while (aVar2.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                        String strX0 = aVar2.x0();
                        int iHashCode = strX0.hashCode();
                        if (iHashCode != 55126294) {
                            if (iHashCode == 1874684019 && strX0.equals("platform")) {
                                b2 = 0;
                            } else {
                                b2 = -1;
                            }
                        } else if (strX0.equals("timestamp")) {
                            b2 = 1;
                        } else {
                            b2 = -1;
                        }
                        if (b2 == 0) {
                            strE0 = c5900pH0.e0();
                        } else if (b2 != 1) {
                            c5900pH0.I();
                        } else {
                            dateD0 = c5900pH0.D0(sentryAndroidOptions.getLogger());
                        }
                        if (strE0 != null && dateD0 != null) {
                            break;
                        }
                    }
                    if ("native".equals(strE0) && dateD0 != null) {
                        cVar = new c(file, dateD0.getTime());
                    }
                    inputStreamReader.close();
                    aVar.close();
                    return cVar;
                } catch (Throwable th) {
                    try {
                        inputStreamReader.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                try {
                    aVar.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (Throwable th5) {
            sentryAndroidOptions.getLogger().c(NG1.DEBUG, th5, "Error parsing event JSON from: %s", file.getName());
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0051  */
    @Nullable
    public final b b(@NotNull String str) {
        byte b2;
        try {
            Charset charset = StandardCharsets.UTF_8;
            InputStreamReader inputStreamReader = new InputStreamReader(new ByteArrayInputStream(str.getBytes(charset)), charset);
            try {
                C5900pH0 c5900pH0 = new C5900pH0(inputStreamReader);
                io.sentry.vendor.gson.stream.a aVar = c5900pH0.d;
                c5900pH0.X0();
                String strE0 = null;
                int iE0 = -1;
                while (aVar.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strX0 = aVar.x0();
                    int iHashCode = strX0.hashCode();
                    if (iHashCode != -1106363674) {
                        if (iHashCode == 3575610 && strX0.equals("type")) {
                            b2 = 0;
                        } else {
                            b2 = -1;
                        }
                    } else if (strX0.equals("length")) {
                        b2 = 1;
                    } else {
                        b2 = -1;
                    }
                    if (b2 == 0) {
                        strE0 = c5900pH0.e0();
                    } else if (b2 != 1) {
                        c5900pH0.I();
                    } else {
                        iE0 = aVar.E0();
                    }
                    if (strE0 != null && iE0 >= 0) {
                        break;
                    }
                }
                if (iE0 < 0) {
                    inputStreamReader.close();
                    return null;
                }
                b bVar = new b(strE0, iE0);
                inputStreamReader.close();
                return bVar;
            } catch (Throwable th) {
                try {
                    inputStreamReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            this.a.getLogger().c(NG1.DEBUG, th3, "Error parsing item header", new Object[0]);
            return null;
        }
        this.a.getLogger().c(NG1.DEBUG, th3, "Error parsing item header", new Object[0]);
        return null;
    }

    public static final class a extends InputStream {

        @NotNull
        public final BufferedInputStream d;
        public long e;

        public a(@NotNull BufferedInputStream bufferedInputStream, int i) {
            this.d = bufferedInputStream;
            this.e = i;
        }

        @Override // java.io.InputStream
        public final int available() {
            return Math.min(this.d.available(), (int) this.e);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            T.c(this.d, this.e);
            this.e = 0L;
        }

        @Override // java.io.InputStream
        public final int read() throws IOException {
            if (this.e <= 0) {
                return -1;
            }
            int i = this.d.read();
            if (i != -1) {
                this.e--;
            }
            return i;
        }

        @Override // java.io.InputStream
        public final long skip(long j) throws IOException {
            long jSkip = this.d.skip(Math.min(j, this.e));
            this.e -= jSkip;
            return jSkip;
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr, int i, int i2) throws IOException {
            long j = this.e;
            if (j <= 0) {
                return -1;
            }
            int i3 = this.d.read(bArr, i, Math.min(i2, (int) j));
            if (i3 > 0) {
                this.e -= (long) i3;
            }
            return i3;
        }
    }
}
