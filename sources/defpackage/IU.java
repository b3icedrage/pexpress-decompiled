package defpackage;

import android.content.Intent;
import android.os.Bundle;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.api.core.deeplinks.DeeplinkManager$handleIntent$2", f = "DeeplinkManager.kt", l = {55}, m = "invokeSuspend")
public final class IU extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ LU g;
    public final /* synthetic */ Intent h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IU(LU lu, Intent intent, JM<? super IU> jm) {
        super(2, jm);
        this.g = lu;
        this.h = intent;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        IU iu = new IU(this.g, this.h, jm);
        iu.e = obj;
        return iu;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((IU) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        String string;
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            LU lu = this.g;
            Intent intent = this.h;
            Bundle extras = intent.getExtras();
            if (extras == null || (string = extras.getString("deeplink_data")) == null) {
                Objects.toString(intent.getExtras());
                return Unit.a;
            }
            this.d = 1;
            if (lu.b(string, this) == mn) {
                return mn;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
        }
        return Unit.a;
    }
}
