package io.sentry.instrumentation.file;

import defpackage.InterfaceC2347Wu0;
import defpackage.QF1;
import io.sentry.util.r;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends FileOutputStream {

    @NotNull
    public final FileOutputStream d;

    @NotNull
    public final io.sentry.instrumentation.file.a e;

    public static final class a {
        public static FileOutputStream a(@Nullable File file, @NotNull FileOutputStream fileOutputStream, boolean z) {
            return QF1.e().p().isTracingEnabled() ? new j(j.c(file, fileOutputStream, z)) : fileOutputStream;
        }

        public static FileOutputStream b(@NotNull FileOutputStream fileOutputStream, @Nullable File file) {
            return QF1.e().p().isTracingEnabled() ? new j(j.c(file, fileOutputStream, false)) : fileOutputStream;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public j(@NotNull c cVar) throws FileNotFoundException {
        FileOutputStream fileOutputStream = cVar.c;
        try {
            super(fileOutputStream.getFD());
            this.e = new io.sentry.instrumentation.file.a(cVar.b, cVar.a, cVar.d);
            this.d = fileOutputStream;
        } catch (IOException unused) {
            throw new FileNotFoundException("No file descriptor");
        }
    }

    public static c c(@Nullable File file, @Nullable FileOutputStream fileOutputStream, boolean z) {
        InterfaceC2347Wu0 interfaceC2347Wu0R = r.a ? QF1.e().r() : QF1.e().e();
        InterfaceC2347Wu0 interfaceC2347Wu0T = interfaceC2347Wu0R != null ? interfaceC2347Wu0R.t("file.write") : null;
        if (fileOutputStream == null) {
            fileOutputStream = new FileOutputStream(file, z);
        }
        return new c(file, interfaceC2347Wu0T, fileOutputStream, QF1.e().p());
    }

    @Override // java.io.FileOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.e.a(this.d);
        super.close();
    }

    @Override // java.io.FileOutputStream, java.io.OutputStream
    public final void write(final int i) {
        this.e.c(new io.sentry.instrumentation.file.a.InterfaceC0395a() { // from class: io.sentry.instrumentation.file.h
            @Override // io.sentry.instrumentation.file.a.InterfaceC0395a
            public final Object call() throws IOException {
                this.d.d.write(i);
                return 1;
            }
        });
    }

    @Override // java.io.FileOutputStream, java.io.OutputStream
    public final void write(final byte[] bArr) {
        this.e.c(new io.sentry.instrumentation.file.a.InterfaceC0395a() { // from class: io.sentry.instrumentation.file.i
            @Override // io.sentry.instrumentation.file.a.InterfaceC0395a
            public final Object call() throws IOException {
                FileOutputStream fileOutputStream = this.d.d;
                byte[] bArr2 = bArr;
                fileOutputStream.write(bArr2);
                return Integer.valueOf(bArr2.length);
            }
        });
    }

    @Override // java.io.FileOutputStream, java.io.OutputStream
    public final void write(final byte[] bArr, final int i, final int i2) {
        this.e.c(new io.sentry.instrumentation.file.a.InterfaceC0395a() { // from class: io.sentry.instrumentation.file.g
            @Override // io.sentry.instrumentation.file.a.InterfaceC0395a
            public final Object call() throws IOException {
                FileOutputStream fileOutputStream = this.d.d;
                byte[] bArr2 = bArr;
                int i3 = i;
                int i4 = i2;
                fileOutputStream.write(bArr2, i3, i4);
                return Integer.valueOf(i4);
            }
        });
    }
}
