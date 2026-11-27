package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class NF {

    @NotNull
    public final LinkedHashMap a;

    @NotNull
    public final Map<String, Double> b;

    public NF(@NotNull Map<String, Double> rates, @NotNull Map<String, Double> beautyRates) {
        Intrinsics.checkNotNullParameter(rates, "rates");
        Intrinsics.checkNotNullParameter(beautyRates, "beautyRates");
        LinkedHashMap linkedHashMap = new LinkedHashMap(OW0.a(rates.size()));
        Iterator<T> it = rates.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String lowerCase = ((String) entry.getKey()).toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            linkedHashMap.put(lowerCase, entry.getValue());
        }
        this.a = linkedHashMap;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(OW0.a(beautyRates.size()));
        Iterator<T> it2 = beautyRates.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it2.next();
            String lowerCase2 = ((String) entry2.getKey()).toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
            linkedHashMap2.put(lowerCase2, entry2.getValue());
        }
        this.b = linkedHashMap2.isEmpty() ? this.a : linkedHashMap2;
    }
}
