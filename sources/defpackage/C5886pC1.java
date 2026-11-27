package defpackage;

import com.api.core.backend.domain.models.resultModels.HttpErrorResponse;
import com.appsflyer.internal.AFg1oSDK;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: pC1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5886pC1 implements Function0 {
    public final /* synthetic */ int d;

    public /* synthetic */ C5886pC1(int i) {
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                return new Gson().f(TypeToken.get(HttpErrorResponse.class));
            default:
                return AFg1oSDK.AFLoggerLogLevel();
        }
    }
}
