package androidx.activity;

import defpackage.ML0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class a extends ML0 implements Function0<Unit> {
    public final /* synthetic */ ComponentActivity d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ComponentActivity componentActivity) {
        super(0);
        this.d = componentActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.d.reportFullyDrawn();
        return Unit.a;
    }
}
