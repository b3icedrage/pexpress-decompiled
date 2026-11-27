package defpackage;

import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public abstract class GW0<Key, Value, Collection, Builder extends Map<Key, Value>> extends Z<Map.Entry<? extends Key, ? extends Value>, Collection, Builder> {

    @NotNull
    public final RJ0<Key> a;

    @NotNull
    public final RJ0<Value> b;

    public GW0(RJ0 rj0, RJ0 rj1) {
        this.a = rj0;
        this.b = rj1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.RJ0
    public final void a(@NotNull C3783fS1 encoder, Object obj) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        h(obj);
        MH1 mh1C = c();
        GH ghC = encoder.C(mh1C);
        Iterator<Map.Entry<? extends Key, ? extends Value>> itG = g(obj);
        int i = 0;
        while (itG.hasNext()) {
            Map.Entry<? extends Key, ? extends Value> next = itG.next();
            Key key = next.getKey();
            Value value = next.getValue();
            int i2 = i + 1;
            ghC.n(c(), i, this.a, key);
            i += 2;
            ghC.n(c(), i2, this.b, value);
        }
        ghC.b(mh1C);
    }

    @Override // defpackage.Z
    public final void j(EH decoder, int i, Object obj) {
        Map builder = (Map) obj;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        Object objR = decoder.r(c(), i, this.a, null);
        int iH = decoder.h(c());
        if (iH != i + 1) {
            throw new IllegalArgumentException(C4564j.c(i, iH, "Value must follow key in a map, index for key: ", ", returned index for value: ").toString());
        }
        boolean zContainsKey = builder.containsKey(objR);
        RJ0<Value> rj0 = this.b;
        builder.put(objR, (!zContainsKey || (rj0.c().h() instanceof AbstractC5356mh1)) ? decoder.r(c(), iH, rj0, null) : decoder.r(c(), iH, rj0, PW0.d(builder, objR)));
    }
}
