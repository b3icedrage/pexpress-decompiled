package defpackage;

import com.jivosite.sdk.db.SdkDb;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class YT implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final InterfaceC1454Lk1 b;

    public /* synthetic */ YT(Object obj, InterfaceC1454Lk1 interfaceC1454Lk1, int i) {
        this.a = i;
        this.b = interfaceC1454Lk1;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                C6102qE1 sdkContext = (C6102qE1) this.b.get();
                Intrinsics.checkNotNullParameter(sdkContext, "sdkContext");
                QA1 qa1B = C3481e1.a(sdkContext.a, SdkDb.class, "jivo-sdk-db").b();
                Intrinsics.checkNotNullExpressionValue(qa1B, "databaseBuilder(\n       …TABASE_NAME\n    ).build()");
                return (SdkDb) qa1B;
            case 1:
                C2263Vt1 retrofit = (C2263Vt1) this.b.get();
                Intrinsics.checkNotNullParameter(retrofit, "retrofit");
                Object objB = retrofit.b(CX1.class);
                Intrinsics.checkNotNullExpressionValue(objB, "retrofit.create(TelemetryApi::class.java)");
                CX1 cx1 = (CX1) objB;
                C0957Fb.i(cx1);
                return cx1;
            default:
                Oc2 passwordValidator = (Oc2) this.b.get();
                Intrinsics.checkNotNullParameter(passwordValidator, "passwordValidator");
                return new C0572Ac1(passwordValidator);
        }
    }
}
