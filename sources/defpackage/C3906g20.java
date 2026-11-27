package defpackage;

import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: g20, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3906g20 extends ML0 implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3906g20(Object obj, int i) {
        super(1);
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object obj2 = this.e;
        switch (this.d) {
            case 0:
                IOException it = (IOException) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                byte[] bArr = C6806tc2.a;
                ((C3277d20) obj2).n = true;
                break;
            default:
                ((C3233co1) obj2).cancel();
                break;
        }
        return Unit.a;
    }
}
