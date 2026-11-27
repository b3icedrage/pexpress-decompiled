package defpackage;

import com.api.core.backend.domain.models.requestModels.ConfigRequest;
import com.api.core.backend.domain.models.responseModels.ConfigResponse;
import com.api.core.backend.domain.models.resultModels.CommonResult;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Oh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.core.backend.repositories.AppRepositoryBase$getCommonConfig$2", f = "AppRepositoryBase.kt", l = {UserVerificationMethods.USER_VERIFY_LOCATION}, m = "invokeSuspend")
public final class C1679Oh extends AW1 implements Function1<JM<? super CommonResult<? extends ConfigResponse>>, Object> {
    public int d;
    public final /* synthetic */ AbstractC1991Sh e;
    public final /* synthetic */ GF g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1679Oh(AbstractC1991Sh abstractC1991Sh, GF gf, JM<? super C1679Oh> jm) {
        super(1, jm);
        this.e = abstractC1991Sh;
        this.g = gf;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(JM<?> jm) {
        return new C1679Oh(this.e, this.g, jm);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(JM<? super CommonResult<? extends ConfigResponse>> jm) {
        return ((C1679Oh) create(jm)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x004a  */
    /* JADX WARN: Code duplicated, block: B:40:0x006e  */
    /* JADX WARN: Code duplicated, block: B:46:0x0080  */
    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        String upperCase;
        String str3;
        String upperCase2;
        String upperCase3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
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
        InterfaceC7446wf interfaceC7446wf = this.e.b;
        ConfigRequest.INSTANCE.getClass();
        GF gf = this.g;
        if (gf == null || (str = gf.a) == null) {
            str = "";
        }
        if (gf == null || (str2 = gf.b) == null) {
            str2 = "";
        }
        if (gf == null || (str8 = gf.f) == null) {
            upperCase = "";
        } else {
            upperCase = str8.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            if (upperCase == null) {
                upperCase = "";
            }
        }
        boolean z = gf != null ? gf.g : false;
        boolean z2 = gf != null ? gf.h : false;
        if (gf == null || (str3 = gf.j) == null) {
            str3 = "";
        }
        if (gf == null || (str7 = gf.k) == null) {
            upperCase2 = "";
        } else {
            upperCase2 = str7.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase2, "toUpperCase(...)");
            if (upperCase2 == null) {
                upperCase2 = "";
            }
        }
        if (gf == null || (str6 = gf.l) == null) {
            upperCase3 = "";
        } else {
            upperCase3 = str6.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase3, "toUpperCase(...)");
            if (upperCase3 == null) {
                upperCase3 = "";
            }
        }
        if (gf == null || (str4 = gf.m) == null) {
            str4 = "";
        }
        if (gf == null || (str5 = gf.n) == null) {
            str5 = "";
        }
        ConfigRequest configRequest = new ConfigRequest(str, str2, upperCase, z, z2, str3, upperCase2, upperCase3, str4, str5, gf != null ? gf.o : null);
        this.d = 1;
        Object objH = interfaceC7446wf.h(configRequest, this);
        return objH == mn ? mn : objH;
    }
}
