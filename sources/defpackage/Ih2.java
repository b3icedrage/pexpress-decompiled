package defpackage;

import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.webpage.downloads.WebViewDownloadsBase$deliverDataUrl$1", f = "WebViewDownloadsBase.kt", l = {173}, m = "invokeSuspend")
public final class Ih2 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ Hh2 e;
    public final /* synthetic */ String g;
    public final /* synthetic */ String h;
    public final /* synthetic */ String i;

    @InterfaceC3368dU(c = "com.base.feature.webpage.downloads.WebViewDownloadsBase$deliverDataUrl$1$result$1", f = "WebViewDownloadsBase.kt", l = {}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super InterfaceC5947pX>, Object> {
        public final /* synthetic */ Hh2 d;
        public final /* synthetic */ String e;
        public final /* synthetic */ String g;
        public final /* synthetic */ String h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Hh2 hh2, String str, String str2, String str3, JM<? super a> jm) {
            super(2, jm);
            this.d = hh2;
            this.e = str;
            this.g = str2;
            this.h = str3;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return new a(this.d, this.e, this.g, this.h, jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super InterfaceC5947pX> jm) {
            return ((a) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            C1795Pt1.b(obj);
            Set<String> set = Hh2.i;
            return this.d.b(this.e, this.g, this.h, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ih2(Hh2 hh2, String str, String str2, String str3, JM<? super Ih2> jm) {
        super(2, jm);
        this.e = hh2;
        this.g = str;
        this.h = str2;
        this.i = str3;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new Ih2(this.e, this.g, this.h, this.i, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((Ih2) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) throws Throwable {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            ExecutorC7200vV executorC7200vV = C6266r20.c;
            a aVar = new a(this.e, this.g, this.h, this.i, null);
            this.d = 1;
            obj = C5189lv.p(executorC7200vV, aVar, this);
            if (obj == mn) {
                return mn;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
        }
        Set<String> set = Hh2.i;
        this.e.c((InterfaceC5947pX) obj);
        return Unit.a;
    }
}
