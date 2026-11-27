package defpackage;

import com.api.core.backend.domain.models.abstractModels.WebSocketResponseAbstract;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: gh2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4046gh2 {

    @NotNull
    public final Gson a;

    public C4046gh2(@NotNull Gson gson) {
        Intrinsics.checkNotNullParameter(gson, "gson");
        this.a = gson;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00f1 A[RETURN] */
    /* JADX WARN: Type inference failed for: r3v2, types: [fO0, java.lang.Object] */
    @Nullable
    public final <T> T a(@NotNull JsonElement json, @NotNull Class<? super T> clazz) {
        T t;
        InterfaceC2691aI1 interfaceC2691aI1;
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        json.getClass();
        boolean z = json instanceof JsonObject;
        Gson gson = this.a;
        if (!z || clazz.isAnnotationPresent(N90.class)) {
            gson.getClass();
            T t2 = (T) C8056za.x(clazz).cast(gson.c(json, TypeToken.get((Class) clazz)));
            if (t2 != null) {
                return t2;
            }
        } else {
            JsonObject jsonObjectD = json.d();
            RI0 ri0J = C7279vr.j(clazz);
            Intrinsics.checkNotNullParameter(ri0J, "<this>");
            Collection<PI0<?>> collectionA = ((C3545eJ0.a) ((C3545eJ0) ri0J).g.getValue()).a();
            ArrayList arrayList = new ArrayList();
            for (T t3 : collectionA) {
                PI0 pi0 = (PI0) t3;
                if (pi0.o().r0() == null && (pi0 instanceof LJ0)) {
                    arrayList.add(t3);
                }
            }
            ArrayList<LJ0> arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                LJ0 lj0 = (LJ0) obj;
                if (!lj0.n().a() && C1546Mp1.a(lj0) != null) {
                    Field fieldA = C1546Mp1.a(lj0);
                    Intrinsics.checkNotNull(fieldA);
                    if (!Modifier.isTransient(fieldA.getModifiers())) {
                        arrayList2.add(obj);
                    }
                }
            }
            if (arrayList2.isEmpty()) {
                gson.getClass();
                t = (T) C8056za.x(clazz).cast(gson.c(json, TypeToken.get((Class) clazz)));
                if (t == null) {
                    return t;
                }
            } else {
                for (LJ0 lj1 : arrayList2) {
                    Field fieldA2 = C1546Mp1.a(lj1);
                    String strValue = (fieldA2 == null || (interfaceC2691aI1 = (InterfaceC2691aI1) fieldA2.getAnnotation(InterfaceC2691aI1.class)) == null) ? null : interfaceC2691aI1.value();
                    if (strValue == null) {
                        strValue = lj1.getName();
                    }
                    if (!jsonObjectD.d.containsKey(strValue)) {
                    }
                }
                gson.getClass();
                t = (T) C8056za.x(clazz).cast(gson.c(json, TypeToken.get((Class) clazz)));
                if (t == null) {
                    return t;
                }
            }
        }
        return null;
    }

    @Nullable
    public final ArrayList b(@NotNull JsonElement json, @NotNull Class clazz) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        json.getClass();
        if (!(json instanceof JsonArray)) {
            return null;
        }
        JsonArray jsonArrayC = json.c();
        Intrinsics.checkNotNullExpressionValue(jsonArrayC, "getAsJsonArray(...)");
        ArrayList arrayList = new ArrayList();
        for (JsonElement jsonElement : jsonArrayC.d) {
            Intrinsics.checkNotNull(jsonElement);
            WebSocketResponseAbstract webSocketResponseAbstract = (WebSocketResponseAbstract) a(jsonElement, clazz);
            if (webSocketResponseAbstract != null) {
                arrayList.add(webSocketResponseAbstract);
            }
        }
        return arrayList;
    }
}
