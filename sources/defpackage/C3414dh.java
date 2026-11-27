package defpackage;

import com.api.core.backend.domain.models.resultModels.CommonError;
import com.pexpress.tool.AppImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: dh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C3414dh implements Function2 {
    public final /* synthetic */ InterfaceC3706f42 d;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object error) {
        String str = (String) obj;
        int i = AppImpl.G;
        Intrinsics.checkNotNullParameter(error, "error");
        CommonError commonError = error instanceof CommonError ? (CommonError) error : null;
        if (commonError != null) {
            this.d.q(commonError, str);
        }
        return Unit.a;
    }
}
