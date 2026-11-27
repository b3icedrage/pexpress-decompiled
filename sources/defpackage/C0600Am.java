package defpackage;

import com.base.feature.stub.screens.stubgame.StubGameFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: Am, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0600Am extends C2784ak0 implements Function0 {
    public final /* synthetic */ int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0600Am(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.m = i3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.m) {
            case 0:
                ((C1146Hm) this.e).A.c();
                return Unit.a;
            default:
                return Boolean.valueOf(((StubGameFragment) this.e).isResumed());
        }
    }
}
