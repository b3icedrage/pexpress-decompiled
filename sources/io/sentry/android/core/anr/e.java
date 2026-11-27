package io.sentry.android.core.anr;

import defpackage.C2688aH1;
import defpackage.NG1;
import io.sentry.ILogger;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements AutoCloseable {

    @NotNull
    public final io.sentry.cache.tape.c<g> d;

    public class a implements io.sentry.cache.tape.c.a<g> {
        @Override // io.sentry.cache.tape.c.a
        public final void a(@NotNull g gVar, @NotNull OutputStream outputStream) throws IOException {
            g gVar2 = gVar;
            DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
            try {
                gVar2.b(dataOutputStream);
                dataOutputStream.flush();
                outputStream.flush();
                dataOutputStream.close();
            } catch (Throwable th) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }

        @Override // io.sentry.cache.tape.c.a
        public final g b(byte[] bArr) throws IOException {
            DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(bArr));
            try {
                if (dataInputStream.readShort() == 1) {
                    long j = dataInputStream.readLong();
                    int i = dataInputStream.readInt();
                    if (i >= 0 && i <= 1000) {
                        StackTraceElement[] stackTraceElementArr = new StackTraceElement[i];
                        for (int i2 = 0; i2 < i; i2++) {
                            String utf = dataInputStream.readUTF();
                            String utf2 = dataInputStream.readUTF();
                            boolean z = dataInputStream.readBoolean();
                            String utf3 = dataInputStream.readUTF();
                            if (z) {
                                utf3 = null;
                            }
                            stackTraceElementArr[i2] = new StackTraceElement(utf, utf2, utf3, dataInputStream.readInt());
                        }
                        return new g(j, stackTraceElementArr);
                    }
                }
            } catch (EOFException unused) {
            }
            return null;
        }
    }

    public e(@NotNull C2688aH1 c2688aH1, @NotNull File file) {
        io.sentry.cache.tape.d dVar;
        ILogger logger = c2688aH1.getLogger();
        try {
            RandomAccessFile randomAccessFileC = io.sentry.cache.tape.d.c(file);
            try {
                try {
                    dVar = new io.sentry.cache.tape.d(file, randomAccessFileC, 120);
                } catch (Throwable th) {
                    randomAccessFileC.close();
                    throw th;
                }
            } catch (IOException e) {
                logger.d(NG1.ERROR, "Failed to create stacktrace queue", e);
                dVar = null;
            }
        } catch (IOException unused) {
            if (!file.delete()) {
                throw new IOException("Could not delete file");
            }
            RandomAccessFile randomAccessFileC2 = io.sentry.cache.tape.d.c(file);
            try {
                dVar = new io.sentry.cache.tape.d(file, randomAccessFileC2, 120);
            } catch (Throwable th2) {
                randomAccessFileC2.close();
                throw th2;
            }
        }
        if (dVar == null) {
            this.d = new io.sentry.cache.tape.a();
        } else {
            this.d = new io.sentry.cache.tape.b(dVar, new a());
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        this.d.close();
    }
}
