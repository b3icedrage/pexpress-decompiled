package defpackage;

import com.google.android.gms.common.api.Api;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: y71, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7758y71<Output> implements InterfaceC7015uc1<Output> {

    @NotNull
    public final List<AbstractC6497s71<Output>> a;
    public final int b;
    public final boolean c;

    /* JADX WARN: Multi-variable type inference failed */
    public C7758y71(@NotNull List<? extends AbstractC6497s71<? super Output>> consumers) {
        boolean z;
        boolean z2;
        int i;
        Intrinsics.checkNotNullParameter(consumers, "consumers");
        this.a = consumers;
        Iterator it = consumers.iterator();
        int i2 = 0;
        while (true) {
            int iIntValue = 1;
            if (!it.hasNext()) {
                break;
            }
            Integer num = ((AbstractC6497s71) it.next()).a;
            if (num != null) {
                iIntValue = num.intValue();
            }
            i2 += iIntValue;
        }
        this.b = i2;
        List<AbstractC6497s71<Output>> list = this.a;
        if (list != null && list.isEmpty()) {
            z = false;
            break;
        }
        Iterator<T> it2 = list.iterator();
        while (true) {
            if (it2.hasNext()) {
                if (((AbstractC6497s71) it2.next()).a == null) {
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        this.c = z;
        List<AbstractC6497s71<Output>> list2 = this.a;
        if (list2 != null && list2.isEmpty()) {
            z2 = true;
            break;
        }
        Iterator<T> it3 = list2.iterator();
        while (true) {
            if (!it3.hasNext()) {
                z2 = true;
                break;
            }
            Integer num2 = ((AbstractC6497s71) it3.next()).a;
            if (!((num2 != null ? num2.intValue() : Api.BaseClientBuilder.API_PRIORITY_OTHER) > 0)) {
                z2 = false;
                break;
            }
        }
        if (!z2) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        List<AbstractC6497s71<Output>> list3 = this.a;
        if (list3 == null || !list3.isEmpty()) {
            Iterator<T> it4 = list3.iterator();
            i = 0;
            while (it4.hasNext()) {
                if ((((AbstractC6497s71) it4.next()).a == null) && (i = i + 1) < 0) {
                    WE.k();
                    throw null;
                }
            }
        } else {
            i = 0;
        }
        if (i <= 1) {
            return;
        }
        List<AbstractC6497s71<Output>> list4 = this.a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list4) {
            if (((AbstractC6497s71) obj).a == null) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(XE.m(arrayList, 10));
        Iterator it5 = arrayList.iterator();
        while (it5.hasNext()) {
            arrayList2.add(((AbstractC6497s71) it5.next()).b);
        }
        throw new IllegalArgumentException(("At most one variable-length numeric field in a row is allowed, but got several: " + arrayList2 + ". Parsing is undefined: for example, with variable-length month number and variable-length day of month, '111' can be parsed as Jan 11th or Nov 1st.").toString());
    }

    @Override // defpackage.InterfaceC7015uc1
    @NotNull
    public final Object a(InterfaceC2928bN interfaceC2928bN, @NotNull String input, int i) {
        Intrinsics.checkNotNullParameter(input, "input");
        int i2 = this.b;
        if (i + i2 > input.length()) {
            C7127v71 message = new C7127v71(this, 0);
            Intrinsics.checkNotNullParameter(message, "message");
            return new C4235hc1(i, message);
        }
        C2590Zo1 c2590Zo1 = new C2590Zo1();
        while (c2590Zo1.d + i < input.length() && Character.isDigit(input.charAt(c2590Zo1.d + i))) {
            c2590Zo1.d++;
        }
        if (c2590Zo1.d < i2) {
            C7337w71 message2 = new C7337w71(c2590Zo1, this);
            Intrinsics.checkNotNullParameter(message2, "message");
            return new C4235hc1(i, message2);
        }
        List<AbstractC6497s71<Output>> list = this.a;
        int size = list.size();
        int i3 = 0;
        while (i3 < size) {
            Integer num = list.get(i3).a;
            int iIntValue = (num != null ? num.intValue() : (c2590Zo1.d - i2) + 1) + i;
            String string = input.subSequence(i, iIntValue).toString();
            InterfaceC6707t71 interfaceC6707t71A = list.get(i3).a(interfaceC2928bN, string);
            if (interfaceC6707t71A != null) {
                C7548x71 message3 = new C7548x71(string, this, i3, interfaceC6707t71A);
                Intrinsics.checkNotNullParameter(message3, "message");
                return new C4235hc1(i, message3);
            }
            i3++;
            i = iIntValue;
        }
        return Integer.valueOf(i);
    }

    public final String b() {
        String str;
        List<AbstractC6497s71<Output>> list = this.a;
        ArrayList arrayList = new ArrayList(XE.m(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            AbstractC6497s71 abstractC6497s71 = (AbstractC6497s71) it.next();
            StringBuilder sb = new StringBuilder();
            Integer num = abstractC6497s71.a;
            if (num == null) {
                str = "at least one digit";
            } else {
                str = num + " digits";
            }
            sb.append(str);
            sb.append(" for ");
            sb.append(abstractC6497s71.b);
            arrayList.add(sb.toString());
        }
        boolean z = this.c;
        int i = this.b;
        if (z) {
            return "a number with at least " + i + " digits: " + arrayList;
        }
        return "a number with exactly " + i + " digits: " + arrayList;
    }

    @NotNull
    public final String toString() {
        return b();
    }
}
