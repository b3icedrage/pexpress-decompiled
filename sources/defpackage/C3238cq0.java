package defpackage;

import androidx.activity.OnBackPressedDispatcher;
import com.base.feature.stub.screens.stubgame.StubGameFragment;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: cq0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3238cq0 extends ML0 implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3238cq0(Object obj, int i) {
        super(0);
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                return CoroutineContext.Element.a.c(new C4002gV1(null), new UN(EN.a.d)).t(((AbstractC3447dq0) this.e).d).t(new IN("ktor-okhttp-context"));
            case 1:
                return (Wd2) ((C3265cz0) this.e).invoke();
            case 2:
                return (Wd2) ((C3265cz0) this.e).invoke();
            case 3:
                ((OnBackPressedDispatcher) this.e).b();
                return Unit.a;
            case 4:
                return (Wd2) ((C3265cz0) this.e).invoke();
            case 5:
                return (Wd2) ((C3265cz0) this.e).invoke();
            case 6:
                return (Wd2) ((C3265cz0) this.e).invoke();
            case 7:
                return (Wd2) ((C3265cz0) this.e).invoke();
            case 8:
                return (StubGameFragment) this.e;
            default:
                return (Wd2) ((C3265cz0) this.e).invoke();
        }
    }
}
