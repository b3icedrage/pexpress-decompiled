package defpackage;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: v21, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7107v21<Target> implements InterfaceC7014uc0<Target> {

    @NotNull
    public final C6926u92<Target> a;

    @NotNull
    public final List<String> b;

    @NotNull
    public final String c;

    /* JADX INFO: renamed from: v21$a */
    public final class a implements InterfaceC6625sk<Target, String> {
        public a() {
        }

        @Override // defpackage.InterfaceC6625sk
        public final String c(Object obj, String str) {
            String newValue = str;
            Intrinsics.checkNotNullParameter(newValue, "newValue");
            AbstractC7107v21<Target> abstractC7107v21 = AbstractC7107v21.this;
            C6833tj1 c6833tj1 = abstractC7107v21.a.a;
            List<String> list = abstractC7107v21.b;
            int iIndexOf = list.indexOf(newValue);
            C6926u92<Target> c6926u92 = abstractC7107v21.a;
            Integer num = (Integer) c6833tj1.c(obj, Integer.valueOf(iIndexOf + c6926u92.b));
            if (num != null) {
                return list.get(num.intValue() - c6926u92.b);
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: v21$b */
    public /* synthetic */ class b extends C2784ak0 implements Function1<Target, String> {
        @Override // kotlin.jvm.functions.Function1
        public final String invoke(Object obj) {
            AbstractC7107v21 abstractC7107v21 = (AbstractC7107v21) this.e;
            C6926u92<Target> c6926u92 = abstractC7107v21.a;
            int iIntValue = ((Number) c6926u92.a.b(obj)).intValue();
            String str = (String) CollectionsKt.H(iIntValue - c6926u92.b, abstractC7107v21.b);
            return str == null ? C5807oq.b(C1332Jw.c(iIntValue, "The value ", " of "), c6926u92.d, " does not have a corresponding string representation") : str;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC7107v21(@NotNull C6926u92<? super Target> field, @NotNull List<String> values, @NotNull String name) {
        Intrinsics.checkNotNullParameter(field, "field");
        Intrinsics.checkNotNullParameter(values, "values");
        Intrinsics.checkNotNullParameter(name, "name");
        this.a = field;
        this.b = values;
        this.c = name;
        int size = values.size();
        int i = field.c;
        int i2 = field.b;
        if (size == (i - i2) + 1) {
            return;
        }
        throw new IllegalArgumentException(("The number of values (" + values.size() + ") in " + values + " does not match the range of the field (" + ((field.c - i2) + 1) + ')').toString());
    }

    @Override // defpackage.InterfaceC7014uc0
    @NotNull
    public final InterfaceC1210Ih0<Target> a() {
        b string = new b(1, this, AbstractC7107v21.class, "getStringValue", "getStringValue(Ljava/lang/Object;)Ljava/lang/String;", 0);
        Intrinsics.checkNotNullParameter(string, "string");
        return new WL1();
    }

    @Override // defpackage.InterfaceC7014uc0
    @NotNull
    public final C7436wc1<Target> b() {
        a aVar = new a();
        StringBuilder sb = new StringBuilder("one of ");
        List<String> list = this.b;
        sb.append(list);
        sb.append(" for ");
        sb.append(this.c);
        return new C7436wc1<>(VE.c(new C6563sS1(list, aVar, sb.toString())), C5653o60.d);
    }

    @Override // defpackage.InterfaceC7014uc0
    public final /* bridge */ /* synthetic */ InterfaceC0883Ec0 c() {
        return this.a;
    }
}
