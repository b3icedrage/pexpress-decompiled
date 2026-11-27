package defpackage;

import java.util.concurrent.Executors;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: ql, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C6210ql implements Function0 {
    public final /* synthetic */ int d;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                return Executors.newSingleThreadScheduledExecutor(new ThreadFactoryC6839tl());
            case 1:
                return Unit.a;
            default:
                return Unit.a;
        }
    }
}
