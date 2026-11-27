package defpackage;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: np1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5596np1 extends AbstractC5173lp1 implements YD0 {

    @NotNull
    public final Object[] b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5596np1(@Nullable C5638o21 c5638o21, @NotNull Object[] values) {
        super(c5638o21);
        Intrinsics.checkNotNullParameter(values, "values");
        this.b = values;
    }

    @Override // defpackage.YD0
    @NotNull
    public final ArrayList e() {
        Object c7486wp1;
        Object[] objArr = this.b;
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object value : objArr) {
            Intrinsics.checkNotNull(value);
            Intrinsics.checkNotNullParameter(value, "value");
            if (C4753jp1.e(value.getClass())) {
                c7486wp1 = new C0611Ap1(null, (Enum) value);
            } else if (value instanceof Annotation) {
                c7486wp1 = new C5386mp1(null, (Annotation) value);
            } else if (value instanceof Object[]) {
                c7486wp1 = new C5596np1(null, (Object[]) value);
            } else {
                c7486wp1 = value instanceof Class ? new C7486wp1(null, (Class) value) : new C0767Cp1(null, value);
            }
            arrayList.add(c7486wp1);
        }
        return arrayList;
    }
}
