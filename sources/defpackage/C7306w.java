package defpackage;

import java.util.concurrent.CancellationException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7306w extends CancellationException {

    @NotNull
    public final transient InterfaceC6606sf0 d;

    public C7306w(@NotNull InterfaceC6606sf0 interfaceC6606sf0) {
        super("Flow was aborted, no more elements needed");
        this.d = interfaceC6606sf0;
    }

    @Override // java.lang.Throwable
    @NotNull
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
