package io.sentry.instrumentation.file;

import defpackage.C6588sa2;
import defpackage.C6798ta2;
import defpackage.InterfaceC2347Wu0;
import defpackage.QF1;
import io.sentry.util.r;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends FileInputStream {

    @NotNull
    public final FileInputStream d;

    @NotNull
    public final io.sentry.instrumentation.file.a e;

    public static final class a {
        public static FileInputStream a(@Nullable File file, @NotNull FileInputStream fileInputStream) {
            return QF1.e().p().isTracingEnabled() ? new f(f.c(file, fileInputStream)) : fileInputStream;
        }

        public static FileInputStream b(@NotNull FileInputStream fileInputStream, @NotNull FileDescriptor fileDescriptor) {
            if (!QF1.e().p().isTracingEnabled()) {
                return fileInputStream;
            }
            InterfaceC2347Wu0 interfaceC2347Wu0R = r.a ? QF1.e().r() : QF1.e().e();
            return new f(new b(null, interfaceC2347Wu0R != null ? interfaceC2347Wu0R.t("file.read") : null, fileInputStream, QF1.e().p()), fileDescriptor);
        }

        public static FileInputStream c(@NotNull FileInputStream fileInputStream, @Nullable String str) {
            if (QF1.e().p().isTracingEnabled()) {
                return new f(f.c(str != null ? new File(str) : null, fileInputStream));
            }
            return fileInputStream;
        }
    }

    public f(@Nullable File file) {
        this(c(file, null));
    }

    public static b c(@Nullable File file, @Nullable FileInputStream fileInputStream) {
        InterfaceC2347Wu0 interfaceC2347Wu0R = r.a ? QF1.e().r() : QF1.e().e();
        InterfaceC2347Wu0 interfaceC2347Wu0T = interfaceC2347Wu0R != null ? interfaceC2347Wu0R.t("file.read") : null;
        if (fileInputStream == null) {
            fileInputStream = new FileInputStream(file);
        }
        return new b(file, interfaceC2347Wu0T, fileInputStream, QF1.e().p());
    }

    @Override // java.io.FileInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.e.a(this.d);
        super.close();
    }

    @Override // java.io.FileInputStream, java.io.InputStream
    public final int read() {
        AtomicInteger atomicInteger = new AtomicInteger(0);
        this.e.c(new C6798ta2(this, atomicInteger));
        return atomicInteger.get();
    }

    @Override // java.io.FileInputStream, java.io.InputStream
    public final long skip(final long j) {
        return ((Long) this.e.c(new io.sentry.instrumentation.file.a.InterfaceC0395a() { // from class: io.sentry.instrumentation.file.d
            @Override // io.sentry.instrumentation.file.a.InterfaceC0395a
            public final Object call() {
                return Long.valueOf(this.d.d.skip(j));
            }
        })).longValue();
    }

    public f(b bVar, FileDescriptor fileDescriptor) {
        super(fileDescriptor);
        this.e = new io.sentry.instrumentation.file.a(bVar.b, bVar.a, bVar.d);
        this.d = bVar.c;
    }

    @Override // java.io.FileInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        return ((Integer) this.e.c(new C6588sa2(this, bArr))).intValue();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public f(@NotNull b bVar) throws FileNotFoundException {
        FileInputStream fileInputStream = bVar.c;
        try {
            super(fileInputStream.getFD());
            this.e = new io.sentry.instrumentation.file.a(bVar.b, bVar.a, bVar.d);
            this.d = fileInputStream;
        } catch (IOException unused) {
            throw new FileNotFoundException("No file descriptor");
        }
    }

    @Override // java.io.FileInputStream, java.io.InputStream
    public final int read(final byte[] bArr, final int i, final int i2) {
        return ((Integer) this.e.c(new io.sentry.instrumentation.file.a.InterfaceC0395a() { // from class: io.sentry.instrumentation.file.e
            @Override // io.sentry.instrumentation.file.a.InterfaceC0395a
            public final Object call() {
                return Integer.valueOf(this.d.d.read(bArr, i, i2));
            }
        })).intValue();
    }
}
