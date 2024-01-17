pub fn find_char(search: char, subject: &str) -> Option<usize> {
    let mut index = 0;
    for c in subject.chars() {
        if c == search {
            return Some(index);
        }       
        index += 1;
    }
    None
}

// run test part, use command " cargo test "
#[cfg(test)]
mod test {
    use super:: *;

    #[test]
    fn test_find()  {
        let search = 'a';
        let subject = "jsdcnjdsbhvhsdb".to_string();

        let index = find_char(search, &subject);

        assert_eq!(index, find_char(search,&subject));
    }

    #[test]
    fn test_find_unsuccessful() {
        let search = 'a';
        let subject = "vnjdsbvhdvbdsbvj".to_string();

        let index = find_char(search,&subject);

        assert_eq!(find_char(search,&subject),index);
    }
}