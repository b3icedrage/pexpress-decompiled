package com.api.core.backend.repositories.user.models.responses;

import com.api.core.backend.domain.models.resultModels.HttpResponse;
import defpackage.C6315rG;
import defpackage.InterfaceC1247It1;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/api/core/backend/repositories/user/models/responses/CommonTokenResponse;", "Lcom/api/core/backend/domain/models/resultModels/HttpResponse;", "", "LIt1;", "LrG;", "result", "Ljava/lang/String;", "getResult", "()Ljava/lang/String;", "CoreBackendApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CommonTokenResponse extends HttpResponse<String> implements InterfaceC1247It1<C6315rG> {

    @Nullable
    private final String result;

    @Override // defpackage.InterfaceC1247It1
    public final C6315rG a() {
        String str = this.result;
        if (str == null) {
            str = "";
        }
        return new C6315rG(str);
    }
}
