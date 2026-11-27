package io.sentry.cache;

import defpackage.C0702Bu;
import defpackage.NG1;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class l implements io.sentry.cache.tape.c.a<C0702Bu> {
    public final /* synthetic */ m a;

    public l(m mVar) {
        this.a = mVar;
    }

    @Override // io.sentry.cache.tape.c.a
    public final void a(C0702Bu c0702Bu, OutputStream outputStream) throws IOException {
        C0702Bu c0702Bu2 = c0702Bu;
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, m.c));
        try {
            this.a.a.getSerializer().b(c0702Bu2, bufferedWriter);
            bufferedWriter.close();
        } catch (Throwable th) {
            try {
                bufferedWriter.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // io.sentry.cache.tape.c.a
    @Nullable
    public final C0702Bu b(byte[] bArr) {
        m mVar = this.a;
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(bArr), m.c));
            try {
                C0702Bu c0702Bu = (C0702Bu) mVar.a.getSerializer().d(bufferedReader, C0702Bu.class);
                bufferedReader.close();
                return c0702Bu;
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            mVar.a.getLogger().c(NG1.ERROR, th3, "Error reading entity from scope cache", new Object[0]);
            return null;
        }
    }
}
