package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class IP0 implements InterfaceC7394wP0, InterfaceC6359rU1<InterfaceC7394wP0.a> {
    public final C2158Uk1 d;
    public final C8120zr e;
    public final /* synthetic */ C0973Fg0 g;

    public final class a extends C20<InterfaceC7394wP0.a> {
        public a() {
        }

        @Override // defpackage.InterfaceC6359rU1
        public final void a(@NotNull Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            throw new IllegalStateException("Stream is terminated", throwable);
        }

        @Override // defpackage.InterfaceC6359rU1
        public final void d(Object obj) {
            InterfaceC7394wP0.a state = (InterfaceC7394wP0.a) obj;
            Intrinsics.checkNotNullParameter(state, "state");
            IP0 ip0 = IP0.this;
            ip0.e.d(state);
            if (state.equals(InterfaceC7394wP0.a.C0527a.a)) {
                ip0.e.onComplete();
                b();
            }
        }

        @Override // defpackage.InterfaceC6359rU1
        public final void onComplete() {
            throw new IllegalStateException("Stream is terminated");
        }
    }

    public IP0() {
        throw null;
    }

    public IP0(int i) {
        AbstractC4836kD1 throttleScheduler = C6099qD1.a;
        Intrinsics.checkNotNullExpressionValue(throttleScheduler, "Schedulers.computation()");
        Intrinsics.checkNotNullParameter(throttleScheduler, "scheduler");
        C2158Uk1 upstreamProcessor = new C2158Uk1();
        Intrinsics.checkNotNullExpressionValue(upstreamProcessor, "PublishProcessor.create()");
        C8120zr downstreamProcessor = new C8120zr();
        Intrinsics.checkNotNullExpressionValue(downstreamProcessor, "BehaviorProcessor.create()");
        Intrinsics.checkNotNullParameter(upstreamProcessor, "upstreamProcessor");
        Intrinsics.checkNotNullParameter(downstreamProcessor, "downstreamProcessor");
        Intrinsics.checkNotNullParameter(throttleScheduler, "throttleScheduler");
        C1285Jg0 c1285Jg0 = new C1285Jg0(downstreamProcessor);
        Intrinsics.checkNotNullExpressionValue(c1285Jg0, "downstreamProcessor.onBackpressureLatest()");
        this.g = new C0973Fg0(c1285Jg0, throttleScheduler);
        this.d = upstreamProcessor;
        this.e = downstreamProcessor;
        C0583Ag0 it = new C0583Ag0(new C1285Jg0(upstreamProcessor), new OV(GP0.m));
        Intrinsics.checkNotNullParameter(it, "it");
        new C0583Ag0(it, new OV(HP0.m)).g(new a());
    }

    @Override // defpackage.InterfaceC6359rU1
    public final void a(@Nullable Throwable th) {
        this.d.d(InterfaceC7394wP0.a.C0527a.a);
    }

    @Override // defpackage.InterfaceC2236Vk1
    public final void b(InterfaceC6359rU1<? super InterfaceC7394wP0.a> interfaceC6359rU1) {
        this.g.b(interfaceC6359rU1);
    }

    @Override // defpackage.InterfaceC6359rU1
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final void d(InterfaceC7394wP0.a aVar) {
        this.d.d(aVar);
    }

    @Override // defpackage.InterfaceC6359rU1
    public final void f(InterfaceC6779tU1 interfaceC6779tU1) {
        this.d.f(interfaceC6779tU1);
    }

    @Override // defpackage.InterfaceC6359rU1
    public final void onComplete() {
        this.d.d(InterfaceC7394wP0.a.C0527a.a);
    }
}
