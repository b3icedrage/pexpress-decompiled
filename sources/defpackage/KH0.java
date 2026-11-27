package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public class KH0 extends AbstractC5418n0 {

    @NotNull
    public final JsonObject e;

    @Nullable
    public final String f;

    @Nullable
    public final MH1 g;
    public int h;
    public boolean i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KH0(@NotNull AbstractC5267mG0 json, @NotNull JsonObject value, @Nullable String str, @Nullable MH1 mh1) {
        super(json);
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(value, "value");
        this.e = value;
        this.f = str;
        this.g = mh1;
    }

    @Override // defpackage.AbstractC7317w21
    @NotNull
    public String S(@NotNull MH1 descriptor, int i) {
        Object next;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        AbstractC5267mG0 abstractC5267mG0 = this.c;
        C4847kH0.c(abstractC5267mG0, descriptor);
        String strF = descriptor.f(i);
        if (this.d.i && !X().d.keySet().contains(strF)) {
            Intrinsics.checkNotNullParameter(abstractC5267mG0, "<this>");
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            Intrinsics.checkNotNullParameter(abstractC5267mG0, "<this>");
            C4222hZ c4222hZ = abstractC5267mG0.c;
            C4222hZ.a<Map<String, Integer>> key = C4847kH0.a;
            C4637jH0 defaultValue = new C4637jH0(abstractC5267mG0, descriptor);
            c4222hZ.getClass();
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
            Object value = c4222hZ.a(descriptor, key);
            if (value == null) {
                value = defaultValue.invoke();
                Intrinsics.checkNotNullParameter(descriptor, "descriptor");
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(value, "value");
                ConcurrentHashMap concurrentHashMap = c4222hZ.a;
                Object concurrentHashMap2 = concurrentHashMap.get(descriptor);
                if (concurrentHashMap2 == null) {
                    concurrentHashMap2 = new ConcurrentHashMap(2);
                    concurrentHashMap.put(descriptor, concurrentHashMap2);
                }
                ((Map) concurrentHashMap2).put(key, value);
            }
            Map map = (Map) value;
            Iterator<T> it = X().d.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                Integer num = (Integer) map.get((String) next);
                if (num != null && num.intValue() == i) {
                    break;
                }
            }
            String str = (String) next;
            if (str != null) {
                return str;
            }
        }
        return strF;
    }

    @Override // defpackage.AbstractC5418n0
    @NotNull
    public JsonElement U(@NotNull String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        return (JsonElement) PW0.d(X(), tag);
    }

    @Override // defpackage.AbstractC5418n0
    @NotNull
    /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
    public JsonObject X() {
        return this.e;
    }

    @Override // defpackage.AbstractC5418n0, defpackage.EH
    public void b(@NotNull MH1 descriptor) {
        Set setD;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        C7577xG0 c7577xG0 = this.d;
        if (c7577xG0.b || (descriptor.h() instanceof AbstractC7448wf1)) {
            return;
        }
        AbstractC5267mG0 abstractC5267mG0 = this.c;
        C4847kH0.c(abstractC5267mG0, descriptor);
        if (c7577xG0.i) {
            Intrinsics.checkNotNullParameter(descriptor, "<this>");
            Set setB = LL.b(descriptor);
            Intrinsics.checkNotNullParameter(abstractC5267mG0, "<this>");
            Map map = (Map) abstractC5267mG0.c.a(descriptor, C4847kH0.a);
            Set setKeySet = map != null ? map.keySet() : null;
            if (setKeySet == null) {
                setKeySet = C6702t60.d;
            }
            setD = C5907pJ1.d(setB, setKeySet);
        } else {
            Intrinsics.checkNotNullParameter(descriptor, "<this>");
            setD = LL.b(descriptor);
        }
        for (String key : X().d.keySet()) {
            if (!setD.contains(key) && !Intrinsics.a(key, this.f)) {
                String input = X().toString();
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(input, "input");
                StringBuilder sbB = C6495s7.b("Encountered an unknown key '", key, "'.\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.\nCurrent input: ");
                sbB.append((Object) C1874Qu.q(-1, input));
                throw C1874Qu.d(-1, sbB.toString());
            }
        }
    }

    @Override // defpackage.AbstractC5418n0, defpackage.InterfaceC7828yU
    @NotNull
    public final EH c(@NotNull MH1 descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        MH1 mh1 = this.g;
        if (descriptor != mh1) {
            return super.c(descriptor);
        }
        JsonElement jsonElementV = V();
        if (jsonElementV instanceof JsonObject) {
            String str = this.f;
            return new KH0(this.c, (JsonObject) jsonElementV, str, mh1);
        }
        StringBuilder sb = new StringBuilder("Expected ");
        C2251Vp1 c2251Vp1 = C2017Sp1.a;
        sb.append(c2251Vp1.b(JsonObject.class));
        sb.append(" as the serialized body of ");
        sb.append(mh1.a());
        sb.append(", but had ");
        sb.append(c2251Vp1.b(jsonElementV.getClass()));
        throw C1874Qu.d(-1, sb.toString());
    }

    @Override // defpackage.EH
    public int h(@NotNull MH1 descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        while (this.h < descriptor.e()) {
            int i = this.h;
            this.h = i + 1;
            String strQ = Q(descriptor, i);
            int i2 = this.h - 1;
            this.i = false;
            if (!X().containsKey(strQ)) {
                boolean z = (this.c.a.e || descriptor.j(i2) || !descriptor.i(i2).c()) ? false : true;
                this.i = z;
                if (z) {
                }
            }
            this.d.getClass();
            return i2;
        }
        return -1;
    }

    @Override // defpackage.AbstractC5418n0, defpackage.InterfaceC7828yU
    public final boolean w() {
        return !this.i && super.w();
    }
}
