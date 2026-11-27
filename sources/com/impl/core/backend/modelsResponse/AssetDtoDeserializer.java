package com.impl.core.backend.modelsResponse;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import defpackage.C1575Mz0;
import defpackage.JG0;
import defpackage.LG0;
import defpackage.XE;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/impl/core/backend/modelsResponse/AssetDtoDeserializer;", "LLG0;", "Lcom/impl/core/backend/modelsResponse/AllAssetsResponse$AssetDto;", "<init>", "()V", "CoreBackendImpl_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AssetDtoDeserializer implements LG0<AllAssetsResponse.AssetDto> {
    @Override // defpackage.LG0
    public final AllAssetsResponse.AssetDto a(JsonElement json, Type typeOfT, JG0 context) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(typeOfT, "typeOfT");
        Intrinsics.checkNotNullParameter(context, "context");
        JsonArray jsonArrayC = json.c();
        int iB = jsonArrayC.h(0).b();
        String strF = jsonArrayC.h(1).f();
        Intrinsics.checkNotNullExpressionValue(strF, "getAsString(...)");
        String strF2 = jsonArrayC.h(2).f();
        Intrinsics.checkNotNullExpressionValue(strF2, "getAsString(...)");
        String strF3 = jsonArrayC.h(3).f();
        Intrinsics.checkNotNullExpressionValue(strF3, "getAsString(...)");
        int iB2 = jsonArrayC.h(9).b();
        boolean zA = jsonArrayC.h(14).a();
        int iB3 = jsonArrayC.h(5).b();
        JsonArray jsonArrayC2 = jsonArrayC.h(15).c();
        Intrinsics.checkNotNullExpressionValue(jsonArrayC2, "getAsJsonArray(...)");
        ArrayList arrayList = new ArrayList(XE.m(jsonArrayC2, 10));
        Iterator<JsonElement> it = jsonArrayC2.d.iterator();
        while (it.hasNext()) {
            arrayList.add(new AllAssetsResponse.TimeFrames(it.next().d().h(C1575Mz0.TIME).b()));
        }
        return new AllAssetsResponse.AssetDto(iB, strF, strF2, strF3, iB2, zA, iB3, arrayList);
    }
}
