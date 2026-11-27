package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: sS1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6563sS1<Output> implements InterfaceC7015uc1<Output> {

    @NotNull
    public final AbstractC7107v21.a a;

    @NotNull
    public final String b;

    @NotNull
    public final a c;

    /* JADX INFO: renamed from: sS1$a */
    public static final class a {

        @NotNull
        public final ArrayList a;
        public boolean b;

        public a() {
            this(null);
        }

        public a(Object obj) {
            ArrayList children = new ArrayList();
            Intrinsics.checkNotNullParameter(children, "children");
            this.a = children;
            this.b = false;
        }
    }

    /* JADX INFO: renamed from: sS1$b */
    public static final class b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return BG.a((String) ((Pair) t).d, (String) ((Pair) t2).d);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C6563sS1(@NotNull Collection strings, @NotNull AbstractC7107v21.a setter, @NotNull String whatThisExpects) {
        int i;
        Intrinsics.checkNotNullParameter(strings, "strings");
        Intrinsics.checkNotNullParameter(setter, "setter");
        Intrinsics.checkNotNullParameter(whatThisExpects, "whatThisExpects");
        this.a = setter;
        this.b = whatThisExpects;
        this.c = new a(null);
        Iterator it = strings.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str.length() <= 0) {
                throw new IllegalArgumentException(("Found an empty string in " + this.b).toString());
            }
            a aVar = this.c;
            int length = str.length();
            for (int i2 = 0; i2 < length; i2++) {
                char cCharAt = str.charAt(i2);
                ArrayList arrayList = aVar.a;
                String strValueOf = String.valueOf(cCharAt);
                int size = arrayList.size();
                C6983uS1 comparison = new C6983uS1(strValueOf);
                Intrinsics.checkNotNullParameter(arrayList, "<this>");
                Intrinsics.checkNotNullParameter(comparison, "comparison");
                WE.j(arrayList.size(), size);
                int i3 = size - 1;
                int i4 = 0;
                while (true) {
                    if (i4 > i3) {
                        i = -(i4 + 1);
                        break;
                    }
                    i = (i4 + i3) >>> 1;
                    int iIntValue = ((Number) comparison.invoke(arrayList.get(i))).intValue();
                    if (iIntValue < 0) {
                        i4 = i + 1;
                    } else if (iIntValue <= 0) {
                        break;
                    } else {
                        i3 = i - 1;
                    }
                }
                ArrayList arrayList2 = aVar.a;
                if (i < 0) {
                    a aVar2 = new a(null);
                    arrayList2.add((-i) - 1, new Pair(String.valueOf(cCharAt), aVar2));
                    aVar = aVar2;
                } else {
                    aVar = (a) ((Pair) arrayList2.get(i)).e;
                }
            }
            if (aVar.b) {
                throw new IllegalArgumentException(C1039Gc0.d("The string '", str, "' was passed several times").toString());
            }
            aVar.b = true;
        }
        b(this.c);
    }

    public static final void b(a aVar) {
        Iterator it = aVar.a.iterator();
        while (it.hasNext()) {
            b((a) ((Pair) it.next()).e);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList<Pair> arrayList2 = aVar.a;
        for (Pair pair : arrayList2) {
            String str = (String) pair.d;
            a aVar2 = (a) pair.e;
            if (!aVar2.b) {
                ArrayList arrayList3 = aVar2.a;
                if (arrayList3.size() == 1) {
                    Pair pair2 = (Pair) CollectionsKt.U(arrayList3);
                    String str2 = (String) pair2.d;
                    arrayList.add(new Pair(Z0.c(str, str2), (a) pair2.e));
                }
            }
            arrayList.add(new Pair(str, aVar2));
        }
        arrayList2.clear();
        arrayList2.addAll(CollectionsKt.Z(arrayList, new b()));
    }

    @Override // defpackage.InterfaceC7015uc1
    @NotNull
    public final Object a(InterfaceC2928bN interfaceC2928bN, @NotNull String input, int i) {
        String str;
        a aVar;
        Intrinsics.checkNotNullParameter(input, "input");
        C2590Zo1 c2590Zo1 = new C2590Zo1();
        c2590Zo1.d = i;
        a aVar2 = this.c;
        Integer numValueOf = null;
        loop0: while (c2590Zo1.d <= input.length()) {
            if (aVar2.b) {
                numValueOf = Integer.valueOf(c2590Zo1.d);
            }
            Iterator it = aVar2.a.iterator();
            do {
                if (!it.hasNext()) {
                    break loop0;
                }
                Pair pair = (Pair) it.next();
                str = (String) pair.d;
                aVar = (a) pair.e;
            } while (!StringsKt.S(c2590Zo1.d, input, str));
            c2590Zo1.d = str.length() + c2590Zo1.d;
            aVar2 = aVar;
        }
        if (numValueOf == null) {
            C6773tS1 message = new C6773tS1(this, input, i, c2590Zo1);
            Intrinsics.checkNotNullParameter(message, "message");
            return new C4235hc1(i, message);
        }
        String string = input.subSequence(i, numValueOf.intValue()).toString();
        AbstractC7107v21.a aVar3 = this.a;
        Object objC = aVar3.c(interfaceC2928bN, string);
        if (objC == null) {
            return numValueOf;
        }
        C7225vc1 message2 = new C7225vc1(objC, string, aVar3, 0);
        Intrinsics.checkNotNullParameter(message2, "message");
        return new C4235hc1(i, message2);
    }
}
