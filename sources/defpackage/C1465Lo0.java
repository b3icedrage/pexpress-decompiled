package defpackage;

import java.util.TreeMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Lo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1465Lo0 extends OP1<C2013So0> implements InterfaceC1153Ho0 {

    @NotNull
    public final EK1 f;

    @NotNull
    public final InterfaceC5570ni1 g;

    @NotNull
    public final TreeMap h;

    /* JADX INFO: renamed from: Lo0$a */
    public static final class a extends ML0 implements Function1<OP1.a<C2013So0>, Unit> {
        public final /* synthetic */ C0997Fo0 e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C0997Fo0 c0997Fo0) {
            super(1);
            this.e = c0997Fo0;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(OP1.a<C2013So0> aVar) {
            OP1.a<C2013So0> updateStateInRepositoryThread = aVar;
            Intrinsics.checkNotNullParameter(updateStateInRepositoryThread, "$this$updateStateInRepositoryThread");
            C1465Lo0 c1465Lo0 = C1465Lo0.this;
            C0997Fo0 c0997Fo0 = this.e;
            C1309Jo0 call = new C1309Jo0(c1465Lo0, c0997Fo0);
            updateStateInRepositoryThread.getClass();
            Intrinsics.checkNotNullParameter(call, "call");
            updateStateInRepositoryThread.c = call;
            C1387Ko0 call2 = new C1387Ko0(c1465Lo0, c0997Fo0);
            Intrinsics.checkNotNullParameter(call2, "call");
            updateStateInRepositoryThread.d = call2;
            return Unit.a;
        }
    }

    /* JADX INFO: renamed from: Lo0$b */
    public static final class b extends ML0 implements Function1<OP1.a<C2013So0>, Unit> {
        public final /* synthetic */ String d;
        public final /* synthetic */ C1465Lo0 e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, C1465Lo0 c1465Lo0) {
            super(1);
            this.d = str;
            this.e = c1465Lo0;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(OP1.a<C2013So0> aVar) {
            OP1.a<C2013So0> updateStateInRepositoryThread = aVar;
            Intrinsics.checkNotNullParameter(updateStateInRepositoryThread, "$this$updateStateInRepositoryThread");
            String str = this.d;
            Pair pairE = C3481e1.e(str);
            long jLongValue = ((Number) pairE.d).longValue();
            ((Number) pairE.e).longValue();
            C1465Lo0 c1465Lo0 = this.e;
            EK1 ek1 = c1465Lo0.f;
            ek1.getClass();
            ek1.o.b(EK1.z[16], Long.valueOf(jLongValue));
            C1542Mo0 call = new C1542Mo0(jLongValue, c1465Lo0);
            updateStateInRepositoryThread.getClass();
            Intrinsics.checkNotNullParameter(call, "call");
            updateStateInRepositoryThread.b = call;
            C1623No0 call2 = new C1623No0(jLongValue, str, c1465Lo0);
            Intrinsics.checkNotNullParameter(call2, "call");
            updateStateInRepositoryThread.c = call2;
            return Unit.a;
        }
    }

    /* JADX INFO: renamed from: Lo0$c */
    public static final class c extends ML0 implements Function1<OP1.a<C2013So0>, Unit> {
        public final /* synthetic */ long d;
        public final /* synthetic */ C1465Lo0 e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(long j, C1465Lo0 c1465Lo0) {
            super(1);
            this.d = j;
            this.e = c1465Lo0;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(OP1.a<C2013So0> aVar) {
            OP1.a<C2013So0> updateStateInRepositoryThread = aVar;
            Intrinsics.checkNotNullParameter(updateStateInRepositoryThread, "$this$updateStateInRepositoryThread");
            long j = this.d;
            C1701Oo0 call = new C1701Oo0(j);
            updateStateInRepositoryThread.getClass();
            Intrinsics.checkNotNullParameter(call, "call");
            updateStateInRepositoryThread.b = call;
            C1779Po0 call2 = new C1779Po0(j, this.e);
            Intrinsics.checkNotNullParameter(call2, "call");
            updateStateInRepositoryThread.c = call2;
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1465Lo0(@NotNull InterfaceC5889pD1 schedulers, @NotNull EK1 storage, @NotNull InterfaceC5570ni1 profileRepository) {
        super(schedulers, "History", new C2013So0(3, ((Number) storage.m.a(EK1.z[14], storage)).longValue()));
        Intrinsics.checkNotNullParameter(schedulers, "schedulers");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(profileRepository, "profileRepository");
        storage.getClass();
        this.f = storage;
        this.g = profileRepository;
        this.h = new TreeMap(new C1231Io0());
    }

    @Override // defpackage.InterfaceC1153Ho0
    public final void B(long j) {
        Q(0L, new c(j, this));
    }

    @Override // defpackage.InterfaceC1153Ho0
    public final boolean G(long j) {
        TreeMap treeMap = this.h;
        if (treeMap.isEmpty()) {
            return true;
        }
        Object objFirstKey = treeMap.firstKey();
        Intrinsics.checkNotNullExpressionValue(objFirstKey, "messagesCache.firstKey()");
        return ((Number) objFirstKey).longValue() < j;
    }

    @Override // defpackage.InterfaceC1153Ho0
    public final void L(@NotNull String msgId) {
        Intrinsics.checkNotNullParameter(msgId, "msgId");
        Q(0L, new b(msgId, this));
    }

    @Override // defpackage.InterfaceC1153Ho0
    public final void N(@NotNull C0997Fo0 message) {
        Intrinsics.checkNotNullParameter(message, "message");
        Q(0L, new a(message));
    }

    @Override // defpackage.InterfaceC1153Ho0
    @NotNull
    public final KP1<C2013So0> a() {
        return this.e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC1153Ho0
    @NotNull
    public final C2013So0 getState() {
        return (C2013So0) this.d;
    }

    @Override // defpackage.InterfaceC1153Ho0
    public final void h() {
        Q(0L, new C1935Ro0(1));
    }
}
