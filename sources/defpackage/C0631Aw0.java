package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Aw0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0631Aw0 implements InterfaceC5331mb0<C8136zw0> {
    public final InterfaceC1454Lk1 a;
    public final InterfaceC1454Lk1 b;
    public final InterfaceC1454Lk1 c;
    public final InterfaceC1454Lk1 d;
    public final InterfaceC1454Lk1 e;
    public final InterfaceC1454Lk1 f;
    public final C5019l6 g;
    public final InterfaceC1454Lk1 h;
    public final InterfaceC1454Lk1 i;

    public C0631Aw0(InterfaceC1454Lk1 interfaceC1454Lk1, InterfaceC1454Lk1 interfaceC1454Lk2, InterfaceC1454Lk1 interfaceC1454Lk3, InterfaceC1454Lk1 interfaceC1454Lk4, InterfaceC1454Lk1 interfaceC1454Lk5, InterfaceC1454Lk1 interfaceC1454Lk6, C5019l6 c5019l6, InterfaceC1454Lk1 interfaceC1454Lk7, InterfaceC1454Lk1 interfaceC1454Lk8) {
        this.a = interfaceC1454Lk1;
        this.b = interfaceC1454Lk2;
        this.c = interfaceC1454Lk3;
        this.d = interfaceC1454Lk4;
        this.e = interfaceC1454Lk5;
        this.f = interfaceC1454Lk6;
        this.g = c5019l6;
        this.h = interfaceC1454Lk7;
        this.i = interfaceC1454Lk8;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        InterfaceC3940gB chatStateRepository = (InterfaceC3940gB) this.a.get();
        InterfaceC5570ni1 profileRepository = (InterfaceC5570ni1) this.b.get();
        InterfaceC1153Ho0 historyRepository = (InterfaceC1153Ho0) this.c.get();
        InterfaceC7011ub1 paginationRepository = (InterfaceC7011ub1) this.d.get();
        InterfaceC7759y72 typingRepository = (InterfaceC7759y72) this.e.get();
        R42 messageTransmitter = (R42) this.f.get();
        InterfaceC4061gl1 handler = (InterfaceC4061gl1) this.g.get();
        M8 agentRepository = (M8) this.h.get();
        Intrinsics.checkNotNullParameter(chatStateRepository, "chatStateRepository");
        Intrinsics.checkNotNullParameter(profileRepository, "profileRepository");
        Intrinsics.checkNotNullParameter(historyRepository, "historyRepository");
        Intrinsics.checkNotNullParameter(paginationRepository, "paginationRepository");
        Intrinsics.checkNotNullParameter(typingRepository, "typingRepository");
        Intrinsics.checkNotNullParameter(messageTransmitter, "messageTransmitter");
        Intrinsics.checkNotNullParameter(handler, "handler");
        Intrinsics.checkNotNullParameter(agentRepository, "agentRepository");
        C8136zw0 c8136zw0 = new C8136zw0(chatStateRepository, profileRepository, historyRepository, paginationRepository, typingRepository, messageTransmitter, handler, agentRepository);
        c8136zw0.i = (EK1) this.i.get();
        return c8136zw0;
    }
}
