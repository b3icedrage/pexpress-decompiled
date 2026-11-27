package defpackage;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: wT0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7406wT0 implements InterfaceC7195vT0 {

    @NotNull
    public final Executor a;

    @NotNull
    public LinkedList<AbstractC5723oS0> b;

    @NotNull
    public final W11<List<AbstractC5723oS0>> c;

    public C7406wT0(@NotNull InterfaceC5889pD1 schedulers) {
        Intrinsics.checkNotNullParameter(schedulers, "schedulers");
        this.a = schedulers.d("Logs");
        LinkedList<AbstractC5723oS0> linkedList = new LinkedList<>();
        this.b = linkedList;
        this.c = new W11<>(linkedList);
    }

    @Override // defpackage.InterfaceC7195vT0
    @NotNull
    public final W11 a() {
        return this.c;
    }

    @Override // defpackage.InterfaceC7195vT0
    public final void b(@NotNull AbstractC5723oS0 message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.a.execute(new RunnableC3117cG0(1, this, message));
    }
}
