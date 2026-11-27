package defpackage;

import java.util.LinkedHashSet;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: fi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3837fi extends ML0 implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3837fi(Object obj, int i) {
        super(1);
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                ((Function0) this.e).invoke();
                break;
            case 1:
                byte bByteValue = ((Number) obj).byteValue();
                StringBuilder sb = (StringBuilder) this.e;
                if (bByteValue == 32) {
                    sb.append("%20");
                } else if (BE.a.contains(Byte.valueOf(bByteValue)) || BE.c.contains(Byte.valueOf(bByteValue))) {
                    sb.append((char) bByteValue);
                } else {
                    sb.append(BE.a(bByteValue));
                }
                break;
            case 2:
                C4891kW $receiver = (C4891kW) obj;
                Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
                MI mi = (MI) this.e;
                mi.getClass();
                $receiver.getClass();
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                if ($receiver.a) {
                    linkedHashSet.add(EnumC2012So.d);
                }
                if ($receiver.b) {
                    linkedHashSet.add(EnumC2012So.e);
                }
                if ($receiver.c) {
                    linkedHashSet.add(EnumC2012So.g);
                }
                if ($receiver.d) {
                    linkedHashSet.add(EnumC2012So.h);
                }
                mi.t = linkedHashSet;
                break;
            case 3:
                ((PQ0) this.e).cancel(false);
                break;
            default:
                Throwable th = (Throwable) obj;
                if (th != null) {
                    ((C2684aG0) this.e).E(new CancellationException(th.getMessage()));
                }
                break;
        }
        return Unit.a;
    }
}
