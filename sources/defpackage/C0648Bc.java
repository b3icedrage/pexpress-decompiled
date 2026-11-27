package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.database.Cursor;
import androidx.annotation.NonNull;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import io.sentry.android.replay.a;
import io.sentry.protocol.u;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Bc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0648Bc implements InterfaceC2179Ur1 {
    public static final C0648Bc d = new C0648Bc();

    public static /* synthetic */ void a(int i) {
        Object[] objArr = new Object[3];
        switch (i) {
            case 1:
            case 4:
                objArr[0] = "b";
                break;
            case 2:
            case 7:
                objArr[0] = "typeCheckingProcedure";
                break;
            case 3:
            default:
                objArr[0] = R51.PUSH_ADDITIONAL_DATA_KEY;
                break;
            case 5:
            case 10:
                objArr[0] = "subtype";
                break;
            case 6:
            case 11:
                objArr[0] = "supertype";
                break;
            case 8:
                objArr[0] = "type";
                break;
            case 9:
                objArr[0] = "typeProjection";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/types/checker/TypeCheckerProcedureCallbacksImpl";
        switch (i) {
            case 3:
            case 4:
                objArr[2] = "assertEqualTypeConstructors";
                break;
            case 5:
            case 6:
            case 7:
                objArr[2] = "assertSubtype";
                break;
            case 8:
            case 9:
                objArr[2] = "capture";
                break;
            case 10:
            case 11:
                objArr[2] = "noCorrespondingSupertype";
                break;
            default:
                objArr[2] = "assertEqualTypes";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static final int c(@NotNull AbstractC7347wA abstractC7347wA, int i) {
        Intrinsics.checkNotNullParameter(abstractC7347wA, "<this>");
        return C6333rM.getColor(abstractC7347wA.getContext(), i);
    }

    public static boolean d(@NotNull InterfaceC1490Lx callableMemberDescriptor) {
        Intrinsics.checkNotNullParameter(callableMemberDescriptor, "callableMemberDescriptor");
        if (!C1251Iv.d.contains(callableMemberDescriptor.getName())) {
            return false;
        }
        if (CollectionsKt.z(C1251Iv.c, C4900kZ.c(callableMemberDescriptor)) && callableMemberDescriptor.j().isEmpty()) {
            return true;
        }
        if (!RK0.z(callableMemberDescriptor)) {
            return false;
        }
        Collection<? extends InterfaceC1490Lx> collectionU = callableMemberDescriptor.u();
        Intrinsics.checkNotNullExpressionValue(collectionU, "getOverriddenDescriptors(...)");
        Collection<? extends InterfaceC1490Lx> collection = collectionU;
        if (collection.isEmpty()) {
            return false;
        }
        for (InterfaceC1490Lx interfaceC1490Lx : collection) {
            Intrinsics.checkNotNull(interfaceC1490Lx);
            if (d(interfaceC1490Lx)) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public static final HK h(@NotNull BufferedReader bufferedReader) {
        Intrinsics.checkNotNullParameter(bufferedReader, "<this>");
        return FH1.b(new C5507nQ0(bufferedReader));
    }

    public static void i(@NonNull AnimatorSet animatorSet, @NonNull ArrayList arrayList) {
        int size = arrayList.size();
        long jMax = 0;
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) arrayList.get(i);
            jMax = Math.max(jMax, animator.getDuration() + animator.getStartDelay());
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 0);
        valueAnimatorOfInt.setDuration(jMax);
        arrayList.add(0, valueAnimatorOfInt);
        animatorSet.playTogether(arrayList);
    }

    public static final List j(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        CQ0 cq0B = VE.b();
        while (cursor.moveToNext()) {
            int i = cursor.getInt(columnIndex);
            int i2 = cursor.getInt(columnIndex2);
            String string = cursor.getString(columnIndex3);
            Intrinsics.checkNotNullExpressionValue(string, "cursor.getString(fromColumnIndex)");
            String string2 = cursor.getString(columnIndex4);
            Intrinsics.checkNotNullExpressionValue(string2, "cursor.getString(toColumnIndex)");
            cq0B.add(new C4428iX1.c(i, i2, string, string2));
        }
        return CollectionsKt.Y(VE.a(cq0B));
    }

    public static final C4428iX1.d l(C3213cj0 c3213cj0, String str, boolean z) throws IOException {
        Cursor cursorF = c3213cj0.f("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = cursorF.getColumnIndex("seqno");
            int columnIndex2 = cursorF.getColumnIndex("cid");
            int columnIndex3 = cursorF.getColumnIndex(AppMeasurementSdk.ConditionalUserProperty.NAME);
            int columnIndex4 = cursorF.getColumnIndex("desc");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1 && columnIndex4 != -1) {
                TreeMap treeMap = new TreeMap();
                TreeMap treeMap2 = new TreeMap();
                while (cursorF.moveToNext()) {
                    if (cursorF.getInt(columnIndex2) >= 0) {
                        int i = cursorF.getInt(columnIndex);
                        String columnName = cursorF.getString(columnIndex3);
                        String str2 = cursorF.getInt(columnIndex4) > 0 ? "DESC" : "ASC";
                        Integer numValueOf = Integer.valueOf(i);
                        Intrinsics.checkNotNullExpressionValue(columnName, "columnName");
                        treeMap.put(numValueOf, columnName);
                        treeMap2.put(Integer.valueOf(i), str2);
                    }
                }
                Collection collectionValues = treeMap.values();
                Intrinsics.checkNotNullExpressionValue(collectionValues, "columnsMap.values");
                List listE0 = CollectionsKt.e0(collectionValues);
                Collection collectionValues2 = treeMap2.values();
                Intrinsics.checkNotNullExpressionValue(collectionValues2, "ordersMap.values");
                C4428iX1.d dVar = new C4428iX1.d(str, z, listE0, CollectionsKt.e0(collectionValues2));
                cursorF.close();
                return dVar;
            }
            cursorF.close();
            return null;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                C6621sj.b(cursorF, th);
                throw th2;
            }
        }
    }

    @NotNull
    public static final ArrayList m(@NotNull BufferedReader bufferedReader) throws IOException {
        Intrinsics.checkNotNullParameter(bufferedReader, "<this>");
        final ArrayList arrayList = new ArrayList();
        Function1 action = new Function1() { // from class: hY1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                String it = (String) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                arrayList.add(it);
                return Unit.a;
            }
        };
        Intrinsics.checkNotNullParameter(bufferedReader, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        try {
            Iterator it = h(bufferedReader).iterator();
            while (it.hasNext()) {
                action.invoke(it.next());
            }
            Unit unit = Unit.a;
            bufferedReader.close();
            return arrayList;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                C6621sj.b(bufferedReader, th);
                throw th2;
            }
        }
    }

    @NotNull
    public static final String n(@NotNull Reader reader) throws IOException {
        Intrinsics.checkNotNullParameter(reader, "<this>");
        StringWriter out = new StringWriter();
        Intrinsics.checkNotNullParameter(reader, "<this>");
        Intrinsics.checkNotNullParameter(out, "out");
        char[] cArr = new char[8192];
        int i = reader.read(cArr);
        while (i >= 0) {
            out.write(cArr, 0, i);
            i = reader.read(cArr);
        }
        String string = out.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @Override // defpackage.InterfaceC2179Ur1
    @NotNull
    public u k() {
        return u.e;
    }

    @Override // defpackage.InterfaceC2179Ur1
    @NotNull
    /* JADX INFO: renamed from: q */
    public InterfaceC2101Tr1 getR() {
        return C3080c51.a;
    }

    @Override // defpackage.InterfaceC2179Ur1
    public void b() {
    }

    @Override // defpackage.InterfaceC2179Ur1
    public void e() {
    }

    @Override // defpackage.InterfaceC2179Ur1
    public void p() {
    }

    @Override // defpackage.InterfaceC2179Ur1
    public void stop() {
    }

    @Override // defpackage.InterfaceC2179Ur1
    public void f(@Nullable Boolean bool) {
    }

    @Override // defpackage.InterfaceC2179Ur1
    public void g(@NotNull a aVar) {
    }
}
