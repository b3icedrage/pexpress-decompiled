package defpackage;

import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.api.utils.CookieUtilsKt$removeAllCookies$2", f = "CookieUtils.kt", l = {88}, m = "invokeSuspend")
public final class YM extends AW1 implements Function2<KN, JM<? super Boolean>, Object> {
    public int d;
    public final /* synthetic */ CookieManager e;

    public static final class a<T> implements ValueCallback {
        public final /* synthetic */ C3525eC1 a;

        public a(C3525eC1 c3525eC1) {
            this.a = c3525eC1;
        }

        @Override // android.webkit.ValueCallback
        public final void onReceiveValue(Object obj) {
            C1717Ot1.a aVar = C1717Ot1.e;
            this.a.resumeWith((Boolean) obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YM(CookieManager cookieManager, JM<? super YM> jm) {
        super(2, jm);
        this.e = cookieManager;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new YM(this.e, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Boolean> jm) {
        return ((YM) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
            return obj;
        }
        C1795Pt1.b(obj);
        CookieManager cookieManager = this.e;
        this.d = 1;
        C3525eC1 c3525eC1 = new C3525eC1(C5885pC0.b(this));
        cookieManager.removeAllCookies(new a(c3525eC1));
        Object objA = c3525eC1.a();
        if (objA == mn) {
            Intrinsics.checkNotNullParameter(this, "frame");
        }
        return objA == mn ? mn : objA;
    }
}
