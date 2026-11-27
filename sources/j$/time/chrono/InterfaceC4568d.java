package j$.time.chrono;

import defpackage.JI1;
import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.temporal.TemporalQuery;
import java.util.Objects;

/* JADX INFO: renamed from: j$.time.chrono.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC4568d extends j$.time.temporal.m, j$.time.temporal.n, Comparable {
    InterfaceC4573i F(ZoneId zoneId);

    LocalTime n();

    ChronoLocalDate o();

    default l h() {
        return o().h();
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    default InterfaceC4568d a(long j, j$.time.temporal.b bVar) {
        return C4570f.r(h(), super.a(j, bVar));
    }

    @Override // j$.time.temporal.TemporalAccessor
    default Object b(TemporalQuery temporalQuery) {
        if (temporalQuery == j$.time.temporal.s.g() || temporalQuery == j$.time.temporal.s.f() || temporalQuery == j$.time.temporal.s.d()) {
            return null;
        }
        if (temporalQuery == j$.time.temporal.s.c()) {
            return n();
        }
        if (temporalQuery == j$.time.temporal.s.a()) {
            return h();
        }
        if (temporalQuery == j$.time.temporal.s.e()) {
            return j$.time.temporal.b.NANOS;
        }
        return temporalQuery.queryFrom(this);
    }

    @Override // j$.time.temporal.n
    default j$.time.temporal.m c(j$.time.temporal.m mVar) {
        return mVar.e(o().toEpochDay(), j$.time.temporal.a.EPOCH_DAY).e(n().f0(), j$.time.temporal.a.NANO_OF_DAY);
    }

    default long V(ZoneOffset zoneOffset) {
        Objects.requireNonNull(zoneOffset, "offset");
        return ((o().toEpochDay() * JI1.SECONDS_IN_A_DAY) + ((long) n().toSecondOfDay())) - ((long) zoneOffset.getTotalSeconds());
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: U */
    default int compareTo(InterfaceC4568d interfaceC4568d) {
        int iCompareTo = o().compareTo(interfaceC4568d.o());
        return (iCompareTo == 0 && (iCompareTo = n().compareTo(interfaceC4568d.n())) == 0) ? ((AbstractC4565a) h()).getId().compareTo(interfaceC4568d.h().getId()) : iCompareTo;
    }
}
