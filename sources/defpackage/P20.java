package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class P20 implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final InterfaceC1454Lk1 b;
    public final InterfaceC1454Lk1 c;
    public final InterfaceC1454Lk1 d;
    public final InterfaceC1454Lk1 e;
    public final InterfaceC1454Lk1 f;
    public final InterfaceC1454Lk1 g;
    public final C5019l6 h;
    public final InterfaceC1454Lk1 i;
    public final InterfaceC1454Lk1 j;

    public /* synthetic */ P20(InterfaceC1454Lk1 interfaceC1454Lk1, InterfaceC1454Lk1 interfaceC1454Lk2, InterfaceC1454Lk1 interfaceC1454Lk3, InterfaceC1454Lk1 interfaceC1454Lk4, InterfaceC1454Lk1 interfaceC1454Lk5, InterfaceC1454Lk1 interfaceC1454Lk6, C5019l6 c5019l6, InterfaceC1454Lk1 interfaceC1454Lk7, InterfaceC1454Lk1 interfaceC1454Lk8, int i) {
        this.a = i;
        this.b = interfaceC1454Lk1;
        this.c = interfaceC1454Lk2;
        this.d = interfaceC1454Lk3;
        this.e = interfaceC1454Lk4;
        this.f = interfaceC1454Lk5;
        this.g = interfaceC1454Lk6;
        this.h = c5019l6;
        this.i = interfaceC1454Lk7;
        this.j = interfaceC1454Lk8;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                InterfaceC3940gB chatStateRepository = (InterfaceC3940gB) this.b.get();
                InterfaceC5570ni1 profileRepository = (InterfaceC5570ni1) this.c.get();
                InterfaceC1153Ho0 historyRepository = (InterfaceC1153Ho0) this.d.get();
                InterfaceC7011ub1 paginationRepository = (InterfaceC7011ub1) this.e.get();
                InterfaceC7759y72 typingRepository = (InterfaceC7759y72) this.f.get();
                R42 messageTransmitter = (R42) this.g.get();
                InterfaceC4061gl1 handler = (InterfaceC4061gl1) this.h.get();
                M8 agentRepository = (M8) this.i.get();
                Intrinsics.checkNotNullParameter(chatStateRepository, "chatStateRepository");
                Intrinsics.checkNotNullParameter(profileRepository, "profileRepository");
                Intrinsics.checkNotNullParameter(historyRepository, "historyRepository");
                Intrinsics.checkNotNullParameter(paginationRepository, "paginationRepository");
                Intrinsics.checkNotNullParameter(typingRepository, "typingRepository");
                Intrinsics.checkNotNullParameter(messageTransmitter, "messageTransmitter");
                Intrinsics.checkNotNullParameter(handler, "handler");
                Intrinsics.checkNotNullParameter(agentRepository, "agentRepository");
                O20 o20 = new O20(chatStateRepository, profileRepository, historyRepository, paginationRepository, typingRepository, messageTransmitter, handler, agentRepository);
                o20.i = (EK1) this.j.get();
                return o20;
            default:
                InterfaceC3940gB chatStateRepository2 = (InterfaceC3940gB) this.b.get();
                InterfaceC5570ni1 profileRepository2 = (InterfaceC5570ni1) this.c.get();
                InterfaceC1153Ho0 historyRepository2 = (InterfaceC1153Ho0) this.d.get();
                InterfaceC7011ub1 paginationRepository2 = (InterfaceC7011ub1) this.e.get();
                InterfaceC7759y72 typingRepository2 = (InterfaceC7759y72) this.f.get();
                R42 messageTransmitter2 = (R42) this.g.get();
                InterfaceC4061gl1 handler2 = (InterfaceC4061gl1) this.h.get();
                M8 agentRepository2 = (M8) this.i.get();
                Intrinsics.checkNotNullParameter(chatStateRepository2, "chatStateRepository");
                Intrinsics.checkNotNullParameter(profileRepository2, "profileRepository");
                Intrinsics.checkNotNullParameter(historyRepository2, "historyRepository");
                Intrinsics.checkNotNullParameter(paginationRepository2, "paginationRepository");
                Intrinsics.checkNotNullParameter(typingRepository2, "typingRepository");
                Intrinsics.checkNotNullParameter(messageTransmitter2, "messageTransmitter");
                Intrinsics.checkNotNullParameter(handler2, "handler");
                Intrinsics.checkNotNullParameter(agentRepository2, "agentRepository");
                O20 o21 = new O20(chatStateRepository2, profileRepository2, historyRepository2, paginationRepository2, typingRepository2, messageTransmitter2, handler2, agentRepository2);
                o21.i = (EK1) this.j.get();
                return o21;
        }
    }
}
