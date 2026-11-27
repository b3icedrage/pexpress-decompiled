package defpackage;

import com.appsflyer.AFLogger;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: nn1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5590nn1 implements Function0 {
    public final /* synthetic */ int d;

    public /* synthetic */ C5590nn1(int i) {
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                return Unit.a;
            default:
                return AFLogger.AFKeystoreWrapper();
        }
    }
}
