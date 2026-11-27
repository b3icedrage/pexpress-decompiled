package io.sentry.android.core.anr;

import io.sentry.util.x;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements Comparable<g> {
    public final StackTraceElement[] d;
    public final long e;

    public g(long j, StackTraceElement[] stackTraceElementArr) {
        this.e = j;
        this.d = stackTraceElementArr;
    }

    public final void b(@NotNull DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeShort(1);
        dataOutputStream.writeLong(this.e);
        StackTraceElement[] stackTraceElementArr = this.d;
        dataOutputStream.writeInt(stackTraceElementArr.length);
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            String className = stackTraceElement.getClassName();
            Charset charset = x.a;
            String str = "";
            if (className == null) {
                className = "";
            }
            dataOutputStream.writeUTF(className);
            String methodName = stackTraceElement.getMethodName();
            if (methodName == null) {
                methodName = "";
            }
            dataOutputStream.writeUTF(methodName);
            String fileName = stackTraceElement.getFileName();
            dataOutputStream.writeBoolean(fileName == null);
            if (fileName != null) {
                str = fileName;
            }
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeInt(stackTraceElement.getLineNumber());
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(@NotNull g gVar) {
        return Long.compare(this.e, gVar.e);
    }
}
