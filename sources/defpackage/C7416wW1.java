package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: wW1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7416wW1 {

    @NotNull
    public final C6821tg1 a;

    public C7416wW1(@NotNull C6821tg1 dataStore) {
        Intrinsics.checkNotNullParameter(dataStore, "dataStore");
        this.a = dataStore;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object a(@NotNull String str, @NotNull LM lm) {
        C6785tW1 c6785tW1;
        if (lm instanceof C6785tW1) {
            c6785tW1 = (C6785tW1) lm;
            int i = c6785tW1.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                c6785tW1.h = i - Integer.MIN_VALUE;
            } else {
                c6785tW1 = new C6785tW1(this, lm);
            }
        } else {
            c6785tW1 = new C6785tW1(this, lm);
        }
        Object objO = c6785tW1.e;
        MN mn = MN.d;
        int i2 = c6785tW1.h;
        if (i2 == 0) {
            C1795Pt1.b(objO);
            InterfaceC6396rf0<AbstractC0662Bg1> data = this.a.a.getData();
            c6785tW1.d = str;
            c6785tW1.h = 1;
            objO = C4466ii.o(data, c6785tW1);
            if (objO == mn) {
                return mn;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = c6785tW1.d;
            C1795Pt1.b(objO);
        }
        Map<AbstractC0662Bg1.a<?>, Object> mapA = ((AbstractC0662Bg1) objO).a();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<AbstractC0662Bg1.a<?>, Object> entry : mapA.entrySet()) {
            if (d.o(entry.getKey().a, str, false)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            arrayList.add(new Pair(StringsKt.M(((AbstractC0662Bg1.a) entry2.getKey()).a, str), entry2.getValue().toString()));
        }
        return PW0.j(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object b(@NotNull String str, @NotNull LM lm) {
        C6995uW1 c6995uW1;
        if (lm instanceof C6995uW1) {
            c6995uW1 = (C6995uW1) lm;
            int i = c6995uW1.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                c6995uW1.g = i - Integer.MIN_VALUE;
            } else {
                c6995uW1 = new C6995uW1(this, lm);
            }
        } else {
            c6995uW1 = new C6995uW1(this, lm);
        }
        Object objA = c6995uW1.d;
        Object obj = MN.d;
        int i2 = c6995uW1.g;
        if (i2 == 0) {
            C1795Pt1.b(objA);
            c6995uW1.g = 1;
            objA = a(str, c6995uW1);
            if (objA == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(objA);
        }
        return CollectionsKt.e0(((Map) objA).values());
    }
}
