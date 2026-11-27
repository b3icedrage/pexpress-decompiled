package defpackage;

import android.webkit.MimeTypeMap;
import com.api.core.backend.domain.models.resultModels.CommonResult;
import com.api.core.backend.domain.models.resultModels.ResultOk;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class L1 extends C2784ak0 implements Function1 {
    public final /* synthetic */ int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ L1(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.m = i3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.m) {
            case 0:
                String p0 = (String) obj;
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((M1) this.e).getClass();
                return MimeTypeMap.getSingleton().getMimeTypeFromExtension(p0);
            case 1:
                JM<? super CommonResult<?>> jm = (JM) obj;
                XS0 xs0 = (XS0) this.e;
                if (!xs0.n) {
                    return new ResultOk(Unit.a);
                }
                xs0.n = false;
                return xs0.k.a(jm);
            default:
                return AbstractC7909yq1.g((AbstractC7909yq1) this.e, (JM) obj);
        }
    }
}
