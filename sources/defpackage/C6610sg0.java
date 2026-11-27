package defpackage;

import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: sg0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6610sg0 implements InterfaceC6396rf0<Object> {
    public final /* synthetic */ InterfaceC6396rf0 d;
    public final /* synthetic */ InterfaceC6396rf0 e;
    public final /* synthetic */ AW1 g;

    /* JADX WARN: Multi-variable type inference failed */
    public C6610sg0(InterfaceC6396rf0 interfaceC6396rf0, InterfaceC6396rf0 interfaceC6396rf1, InterfaceC1060Gj0 interfaceC1060Gj0) {
        this.d = interfaceC6396rf0;
        this.e = interfaceC6396rf1;
        this.g = (AW1) interfaceC1060Gj0;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [AW1, Gj0] */
    @Override // defpackage.InterfaceC6396rf0
    @Nullable
    public final Object c(@NotNull InterfaceC6606sf0<? super Object> interfaceC6606sf0, @NotNull JM<? super Unit> jm) {
        Object objA = C4372iF.a(jm, interfaceC6606sf0, new C6820tg0(this.g, null), C7240vg0.d, new InterfaceC6396rf0[]{this.d, this.e});
        return objA == MN.d ? objA : Unit.a;
    }
}
