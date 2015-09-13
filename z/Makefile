ROOT = ..
PLATFORM = $(shell $(ROOT)/systype.sh)
include $(ROOT)/Make.defines.$(PLATFORM)
include $(ROOT)/Make.include

#
# all targets to build...
# we can build them one by one like:
#     make array_to_BST
# or just
#     make all
# to build all targets.
#

#
# all targets...
#
TARGETS = $(strip array_to_BST happy_number min_path_sum queue_using_stacks \
		  rm_linked_list_elements repeated_dna_seq)

all: $(TARGETS)

array_to_BST: $(BINDIR)/array_to_BST
happy_number: $(BINDIR)/happy_number
min_path_sum: $(BINDIR)/min_path_sum
queue_using_stacks: $(BINDIR)/queue_using_stacks
rm_linked_list_elements: $(BINDIR)/rm_linked_list_elements
repeated_dna_seq: $(BINDIR)/repeated_dna_seq

BINARIES = $(addprefix $(BINDIR)/, $(TARGETS))

#
# static pattern rules to make certain target...
#
$(BINARIES): $(BINDIR)/%: $(OBJDIR)/%.o
	$(LINK.c) -o $@ $< $(STDLIBS)

help:
	@echo "Targets to build:"
	@echo "  $(TARGETS)\n"
	@echo "  'make <target>' to build single target;"
	@echo "  'make all' to build whole targets.\n"

.PHONY: all help \
	array_to_BST happy_number min_path_sum queue_using_stacks \
	rm_linked_list_elements repeated_dna_seq

